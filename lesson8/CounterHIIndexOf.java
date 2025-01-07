public class CounterHIIndexOf {

    public static int countHi(String str) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf("hi", index)) != -1) {
            count++;
            index += 2; 
        }
        return count;
    }

    public static void main(String[] args) {
        // Приклади використання (аналогічні попередньому прикладу)
         System.out.println("countHi(\"abc hi ho\") -> " + countHi("abc hi ho")); // Виведе 1
        System.out.println("countHi(\"ABChi hi\") -> " + countHi("ABChi hi")); // Виведе 2
        System.out.println("countHi(\"hihi\") -> " + countHi("hihi")); // Виведе 2
        System.out.println("countHi(\"h\") -> " + countHi("h")); // Виведе 0
        System.out.println("countHi(\"\") -> " + countHi("")); // Виведе 0
        System.out.println("countHi(\"hi\") -> " + countHi("hi")); // Виведе 1
         System.out.println("countHi(\"xhixhix\") -> " + countHi("xhixhix")); // Виведе 2
    }
}