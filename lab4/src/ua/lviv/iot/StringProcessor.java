package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringProcessor {
    public StringBuilder readFromConsole() throws IOException {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        StringBuilder text = new StringBuilder(input);
        return text;
    }

    public void writeToConsole(StringBuilder resultText) {
        System.out.println("Changed text: " + resultText.toString());
    }

    public void processText(StringBuilder text) {
        Pattern firstPattern = Pattern.compile("\\w{10}[a-zA-Z]{5}\\d{5}");
        //Pattern secondPattern = Pattern.compile("[a-zA-Z]{5}");
        //Pattern thirdPattern = Pattern.compile("\\d{5}");
        Matcher firstMathcher = firstPattern.matcher(text);
        while (firstMathcher.find()) {



            //Matcher secondMathcher = secondPattern.matcher(firstSubString);
            //while (secondMathcher.find()) {
            //StringBuilder secondSubString = new StringBuilder(firstSubString.substring(secondMathcher.start(), secondMathcher.end()));
            //Matcher thirdMathcher = thirdPattern.matcher(secondSubString);
            //while (thirdMathcher.find()) {
            //StringBuilder thirdSubString = new StringBuilder(secondSubString.substring(thirdMathcher.start(), thirdMathcher.end()));
            System.out.println("Enter the replacement word: ");
            Scanner inputWord = new Scanner(System.in);
            String input = inputWord.nextLine();
            StringBuilder replacementWord = new StringBuilder(input);
            text.replace(firstMathcher.start(), firstMathcher.end(), replacementWord.toString());
        }
    }
            //}

        //String[] words = text.split("[.\\!]");
        //return processWords(words);

    /** public LinkedList<String> processWords(String[] words) {
     System.out.println("Enter the replacement word: ");AAA
     Scanner inputWord = new Scanner(System.in);
     String replacementWord = inputWord.next();


     return
     */

}

