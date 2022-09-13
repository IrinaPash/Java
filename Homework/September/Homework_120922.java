package org.example;

public class Homework_120922 {


    /* Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str
    меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»
     */
    private static void StringReplaceWithChar(String str, char oldChar, char newChar) {
        String oldString = "Sascha";
        String newString = oldString.replace('S', 'M');
        System.out.println("oldString before replace : " + oldString + "\n");
        System.out.println("New String : " + newString + "\n");

    }

    public static void main(String[] args) {
        StringReplaceWithChar(new String("Sascha"),'S','M');

    }
}


