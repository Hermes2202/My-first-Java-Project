
package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1HomeWork {
    public static void main(String[] args) {
       //Cоздать масив целых чисел длинной в 10 ть элементов;
        int[] myArray = new int[10];
        myArray [0] = 96;
        myArray [1] = 14;
        myArray [2] = 66;
        myArray [3] = 87;
        myArray [4] = 45;
        myArray [5] = 33;
        myArray [6] = 22;
        myArray [7] = 16;
        myArray [8] = 90;
        myArray [9] = 55;
       // можно было и так int[]myArray = {1,2,3,4,5,6,7,8,9,99};  bistree :)
        Arrays.sort(myArray); // отсортировали наш масив от малого до большого
        System.out.println(Arrays.toString(myArray)); //""какбе отформатировали" и выиели на экран

        Scanner sKlaviaturi = new Scanner( System.in );// создали переменную типа сканер , метод 
        System.out.println("Enter you numbers :");   // 
        int vvodnoeChislo = sKlaviaturi.nextInt();  //попросили ввести из клавиатуры количество ячеел(елементов);
        int [] myArray2 = new int[vvodnoeChislo];  // сщздали масив и занесли в него значение вводного числа;

        for (int i = 0; i < myArray2.length; i++){  // запустили цикл в котором вводим числа в ячейки масива п нашему первому числу(аргументу)ж
            myArray2[i] = sKlaviaturi.nextInt();
        }




    }
}
