

public class Homework_260922 {
    /* Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве.
       Например: {1,3,6,-1,4,-5,9} -> -5
        */
    public static int minValue(int[] array){
        int minValue = array[0];
        for ( int i =1; i < array.length; i++) {
            if (array[i] < minValue ){
                minValue = array[i];

            }
        }
        return minValue;

    }

    /*Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.
          Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2
     */
    public static int getLongString(String[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > array[max].length()) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int [] array = new int[]{1,3,6,-1,4,-5,9};
        System.out.println("min value : " + minValue(array));

        System.out.println("");


        String[] names = {"qwe","axcvbn","qwertyuio","qas" };
        int longString = getLongString(names);
        System.out.println("The Longest String is: " + names[longString] + " With The Index Of: " + longString);
    }


 }


