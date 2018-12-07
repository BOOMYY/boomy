/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
public class SpellChecker {

    private final HashMap<String, Integer> Words = new HashMap<String, Integer>();

    public SpellChecker(String file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        Pattern p = Pattern.compile("\\w+");
        for (String temp = ""; temp != null; temp = in.readLine()) {
            Matcher m = p.matcher(temp.toLowerCase());
            while (m.find()) {
                Words.put((temp = m.group()), Words.containsKey(temp) ? Words.get(temp) + 1 : 1);
            }
        }
        in.close();
    }

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

    public final String correct(String word) {
        String word1 = word.toLowerCase();   //* 
        if (Words.containsKey(word1)) {
            return word;   //* 
        }
        ArrayList<String> list = editDistance(word1);
        HashMap<Integer, String> candidates = new HashMap<Integer, String>();
        for (String s : list) {
            if (Words.containsKey(s)) {
                candidates.put(Words.get(s), s);
            }
        }
        if (candidates.size() > 0) {
            System.out.println(word + " : " + candidates);   //* 
            return candidates.get(Collections.max(candidates.keySet()));
        }
        for (String s : list) {
            for (String w : editDistance(s)) {
                if (Words.containsKey(w)) {
                    candidates.put(Words.get(w), w);
                }
            }
        }
        return candidates.size() > 0 ? candidates.get(Collections.max(candidates.keySet())) : word;
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Enter the word: ");
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        String stmt = BR.readLine();
        String seg[] = stmt.split(" ");
        for (String s : seg) {
            System.out.println((s + " : ") + (new SpellChecker("C:\\Users\\Tagaya\\Documents\\NetBeansProjects\\JavaApplication19\\src\\javaapplication19\\DIC")).correct(s));
        }
    }

}
