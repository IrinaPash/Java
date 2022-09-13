package org.example;

public class Homework_120922 {


    public static void main(String[] args) {
        /* Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str
        меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»
         */

        String oldString = "Sasha";
        String newString =  oldString.replace('S', 'M');

        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);
    }

}