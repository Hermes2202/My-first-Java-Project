
import java.lang.reflect.Array;
import java.util.Arrays;

//Заполнить массив числами от 100 до 0.
public class Less4zadacha3 {
    public static void main(String[] args) {
        int [] a = new int [100];

        for(int i =0; i < a.length; i++){
            if(i == 0) {
                a[i] = 1;
            }else{
                a[i] = a[i -1] +1;
            }
        }
        for(int x: a) {
            System.out.println(x + " ");
        }
        System.out.println();
            for(int i = a.length -1; i >=0; --i){
                System.out.print(a[i]+" ");
            }
        }
    }

