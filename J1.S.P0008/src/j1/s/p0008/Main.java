/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //Step1: Input the string value
        String content = inputString();
        //Step2: Count number of letters
        HashMap<String, Integer> countLetters = countLetters(content);
        //Step3: Count number of character
        HashMap<Character, Integer> countCharacters = countCharacters(content);
        //Step4: Display number of letter
        displayLetters(countLetters);
        //Step5: Display number of character
        displayCharacter(countCharacters);
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your content:");
            String s = scanner.nextLine().trim();
            //Check input string empty
            if(s.isEmpty()) { 
                System.out.println("String cannot be empty");
            } else { 
                return s;
            }
        }
    }

    private static HashMap<String, Integer> countLetters(String content) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(content);
        //Loop until tokenizer run out of token
        while(tokenizer.hasMoreTokens()) { 
            String token = tokenizer.nextToken();
            //Check if the token present in the map
            if(wordCount.containsKey(token)) {
                wordCount.put(token, (int) wordCount.get(token) + 1);
            } else {
                wordCount.put(token, 1);
            }
        }
        return wordCount;
    }

    private static HashMap<Character, Integer> countCharacters(String content) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        //Loop through each character in string
        for (char ch : content.toCharArray()) {
            //check if current character is space character
            if(Character.isSpaceChar(ch)) { 
                continue;
            } 
            //Check if character is exist
            if(charCount.containsKey(ch)) { 
                charCount.put(ch, (int) charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }           
        }
        return charCount;
    }

    private static void displayLetters(HashMap<String, Integer> countLetters) {
        int count = 0;
        int size = countLetters.size();
        System.out.print("{");
        //Loop through all entry in map
        for (Map.Entry<String, Integer> entry : countLetters.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
            count++;
            //Check if it's not the last element
            if(count < size) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    private static void displayCharacter(HashMap<Character, Integer> countCharacters) {
        int count = 0;
        int size = countCharacters.size();
        System.out.print("{");
        //Loop through all entry in map
        for (Map.Entry<Character, Integer> entry : countCharacters.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue());
            count++;
            //Check if it's not the last element
            if(count < size) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
