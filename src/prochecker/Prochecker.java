/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prochecker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tagaya
 */
public class Prochecker {

    private final HashMap<String, Integer> Words = new HashMap<String, Integer>();

    /**
     * This Method Constructs a new spell corrector. Builds up a hashmap of
     * correct words with their frequencies, based on the words in the given
     * file.
     *
     * @param file the text to process
     * @throws IOException
     */
    public Prochecker(String file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        // This pattern matches any word character (letters or digits)
        Pattern p = Pattern.compile("\\w+");
        for (String temp = ""; temp != null; temp = in.readLine()) {
            Matcher m = p.matcher(temp.toLowerCase());
            // find looks for next match for pattern p (in this case a word).  True if found.
            // group then returns the last thing matched.
            // The ? is a conditional expression.
            while (m.find()) {
                Words.put((temp = m.group()), Words.containsKey(temp) ? Words.get(temp) + 1 : 1);
            }
        }
        in.close();
    }

    /**
     * This Medthod Constructs a list of all words within edit distance 1 of the
     * given word.
     *
     * @param word the word to construct the list from
     * @return a list of words with in edit distance 1 of word
     */
    private final ArrayList<String> editDistance(String word) {
        ArrayList<String> result = new ArrayList<String>();  //list of all words within edit distance of 1 

        // deletion 
        for (int i = 0; i < word.length(); ++i) {
            result.add(word.substring(0, i) + word.substring(i + 1));
        }

        // transposition 
        for (int i = 0; i < word.length() - 1; ++i) {
            result.add(word.substring(0, i) + word.substring(i + 1, i + 2) + word.substring(i, i + 1) + word.substring(i + 2));
        }

        // substitution 
        for (int i = 0; i < word.length(); ++i) {
            for (char c = 'a'; c <= 'z'; ++c) {
                result.add(word.substring(0, i) + String.valueOf(c) + word.substring(i + 1));
            }
        }

        // addition 
        for (int i = 0; i <= word.length(); ++i) {
            for (char c = 'a'; c <= 'z'; ++c) {
                result.add(word.substring(0, i) + String.valueOf(c) + word.substring(i));
            }
        }

        return result;
    }

    /**
     * Corrects the spelling of a word, if it is within edit distance 2.
     *
     * @param word the word to check/correct
     * @return word if correct or too far from any word; corrected word
     * otherwise
     */
    public final String correct(String word) {
        String word1 = word.toLowerCase();
        if (Words.containsKey(word1)) {
            return word;
        }
        ArrayList<String> list = editDistance(word1);
        HashMap<Integer, String> candidates = new HashMap<Integer, String>();
        // Find all things edit distance 1 that are in the dictionary.  Also remember
        //   their frequency count from nWords.  F
        for (String s : list) {
            if (Words.containsKey(s)) {
                candidates.put(Words.get(s), s);
            }
        }
//        If found something edit distance 1 return the most frequent word
        if (candidates.size() > 0) {
            System.out.println(word + " : " + candidates);   //* 
            return candidates.get(Collections.max(candidates.keySet()));
        }
        // Find all things edit distance 1 from everything of edit distance 1.  These
        // will be all things of edit distance 2 (plus original word).  Remember frequencies
        for (String s : list) {
            for (String w : editDistance(s)) {
                if (Words.containsKey(w)) {
                    candidates.put(Words.get(w), w);
                }
            }
        }
        // If found something edit distance 2 return the most frequent word.
        // If not return the word with a "?" prepended.  (Original just returned the word.)
        return candidates.size() > 0 ? candidates.get(Collections.max(candidates.keySet())) : word;
    }

    /**
     * *
     *
     * This is main that buffered the files and get user input and get the
     * display.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        System.out.println("=====================SPELL CHECKER=============================");
        System.out.println("Enter the word: ");
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        String stmt = BR.readLine();
        String seg[] = stmt.split(" ");
        for (String s : seg) {
            System.out.println("====================PROCESS=================================");
            System.out.println((s + " ==> ") + (new Prochecker("C:\\Users\\Tagaya\\Documents\\NetBeansProjects\\JavaApplication19\\src\\javaapplication19\\DIC")).correct(s));
        }
    }

}
