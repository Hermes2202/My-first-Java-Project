import java.util.Arrays;
import java.util.Random;
/*Дано массив из 10 целых чисел. Вывести на экран
*        сумму всех его элементов кроме первого и
        последнего.*/
public class Less4Zadacha4 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        for (int i = 1; i < a.length -1; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     /*
    }
}
        int[] a = new int[100];//Random;
        Random r = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = r. nextInt(){
        int sum = 0; // long

       } for (int i = 0; i < a.length; i++) {
            if (a[i] > 5)
                sum += a[i];
        }
        System.out.println("Сумма = " + sum);
    }
}
        int[]a =new int[3];
        int[]b =new int[3]; //napolnenie dvux masivov odnim ciklom
        for(int i=0, j = a.length -1; i < a.length && j > 0; i++,j--){
            a[i] = i;
            b[j] = j;
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
    }
}
        int [] a = new int [100];
        int [] b = new int [100];
        for(int i = 0; i<a.length; i++) {
            a[i] = i;
            b[i] = i*2;
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
    }
}
         // srednee aryfmetichesskoe massiva;
           int [] array = {22,76,89,98,34,15};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum  += array [i];
        }
        System.out.println(sum / array.length);
    }
}  */
