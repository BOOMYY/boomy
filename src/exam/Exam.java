/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ITRO
 */
public class Exam {

    /**
     * 10 points
     *
     * TO-DO remove all numbers, EXCEPT number 5, from the input sentence.
     *
     * @param sentence input sentence that contains numbers and letters
     * (lowercase).
     *
     * NOTE: Use regular expression ONLY.
     *
     * @return cleaned sentence.
     */
    public String questionA(String sentence) {
        String pattern;
        pattern = "[12346789]";

        String temp = sentence.replaceAll("", pattern);

        return temp;
    }
//    void main(){
//        Exam questionA = new Exam();
//        String sentence = "nsvodopan12lkmnf5zlkjnvsdovn65123";
//        String temp = questionA(sentence);
//        System.out.println(temp);

    /**
     * 10 points
     *
     * TO-DO Display the total number occurrences of letters in a sentence.
     * These letters are the following: p,o,k,e,m,n
     *
     * NOTE: Use regular expression ONLY.
     *
     * @param sentence user input that will be cleaned.
     */
    public void questionB(String sentence) {
        String pattern = "[p,o,k,e,m,n]";
        int count = 0;
        int p = 0;
        int o = 0;
        int k = 0;
        int e = 0;
        int m = 0;
        int n = 0;

        Pattern pat = Pattern.compile(pattern);
        Matcher find = pat.matcher(sentence);

        while (find.find()) {
            if (find.group(0).equalsIgnoreCase("p")) {
                p++;
            } else if (find.group(0).equalsIgnoreCase("o")) {
                o++;
            } else if (find.group(0).equalsIgnoreCase("k")) {
                k++;
            } else if (find.group(0).equalsIgnoreCase("m")) {
                m++;
            } else if (find.group(0).equalsIgnoreCase("n")) {
                n++;
            }
        }
        System.out.println("Letter p: " + p);
        System.out.println("Letter o: " + o);
        System.out.println("Letter k: " + k);
        System.out.println("Letter m " + m);
        System.out.println("Letter n: " + n);

    }

    /**
     * 10 points
     *
     * TO-DO add all numbers stored in the input array.
     *
     * @param arr input array of user.
     *
     * @return sum of all numbers stored in array.
     */
    public int questionC(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                count += arr[i][x];
            }
        }
        return count;
    }

    /**
     * 10 points
     *
     * TO-DO Display the sum of all numbers in TestFile.txt
     *
     * NOTE: include exception handling.
     *
     * @param filePath the text file that will be read. This text file only
     * contains number.
     */
    public void questionD(String filePath) {
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String pattern = "[0-9]";
            String temp;
            int count = 0;
            while ((temp = read.readLine()) != null) {
//            Pattern 

            }

        } catch (Exception e) {

        }

    }

    /**
     * 10 points
     *
     * TO-DO code here the logic that returns the total number of unique words
     * from TestFileFour.txt
     *
     * @param filePath the text file that will be read. This text file only
     * contains number.
     *
     * @return total unique words
     */
    public int questionE(String filePath) {

        return 0;
    }

    /**
     * 10 points
     *
     * TO-DO Display the sum of all numbers in TestFileTwo.txt
     *
     * NOTE: include exception handling.
     *
     * @param filePath the text file that will be read. This text file only
     * contains number.
     */
    public void questionF(String filePath) {
        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String pattern = "[0-9]";
            String temp;
            int count = 0;
            while ((temp = read.readLine()) != null) {
                Pattern tt = Pattern.compile(pattern);
                Matcher ss = tt.matcher(temp);

                while (ss.find()) {
                    int temp2 = Integer.parseInt(ss.group(0));
                    count += temp2;

                }

            }
            System.out.println(count);
        } catch (Exception e) {

        }
    }

    /**
     * 20 points
     *
     * Display all numbers divisible by 2 AND 3 from 1 to N.
     *
     * NOTE: Use RECURSION
     *
     * @param n the limit of the number.
     *
     */
    public void questionG(int y, int n) {
        if (y == n) {
            System.out.println("end");
        } else if (y % 2 == 0 && y % 3 == 0) {
            System.out.println(y);
            questionG(y + 1, n);
        } else {
            questionG(y + 1, n);
        }

    }

    /**
     * 20 points
     *
     * TO-DO code here the logic that removes all specific characters from
     * sentences. TextFileThree.txt
     *
     * @param filePath the text file that will be read. This text file only
     * contains number.
     *
     * The first line of the input gives the number of test cases, T. The first
     * line of each T contains two integer, S and C. The next S line are the
     * sentences of each T. The last line contains C characters that will be
     * deleted from sentences of each T.
     */
    public void questionH(String filePath) {

    }

    /**
     * 5 points
     *
     * Display all numbers from 1 to N.
     *
     * @param n the limit of the number.
     */
    public void questionI(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }

    /**
     * 5 points
     *
     * TO-DO display all EVEN numbers from 1 to 100
     */
    public void questionJ() {

        for (int x = 1; x <= 100; x++) {
            System.out.println(x);

        }

    }

    public static void main(String[] args) {
        Exam sc = new Exam();
        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        //sc.questionG(1, 100);
//        int temp2 = sc.questionC(arr);
//        System.out.println(temp2);
//        String temp = "wqetqwr12315sdqwfsdf";
//        String x = sc.questionA(temp);
//        System.out.println(temp);
//        sc.questionB("1312pomnasdhasd");
//        sc.questionI(50);
//        sc.questionJ();
        //sc.questionH("C:\\Users\\pc\\Desktop\\TestFileThree.txt");
        sc.questionF("C:\\Users\\pc\\Desktop\\TestFileTwo.txt");
        //String filePath= "C:\\Users\\pc\\Desktop\\TestFileThree.txt";
    }

}
