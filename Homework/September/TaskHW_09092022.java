package org.example;

public class TaskHW_09092022 {

       /*
        Homework Level 1:
        C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
     */

        private static void list ( int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }


    /*
       Homework Level 2:
       C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
     */
    public static int TotalAmount(int n) {

        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        list(10);
        System.out.println();
        System.out.println("__________________________________");
        System.out.println("sum = " +TotalAmount(20));

    }

}
