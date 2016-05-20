import java.util.Scanner;

//Вывести на screen числа от 10-go до 20ти с помощью всех извесных loopsov.
//for/if/else/while/switch/do
public class Less4Zadacha1 {
    public static void main(String[]args){

        for(int i = 10;i < 20;i++){
            System.out.println(i+1);
        }

        int a = 10;
            while(a < 20){
                a++ ;    // += 1;
                if(a == 20){
                    break;
                }
                System.out.print(a+1);
            }
        int c = 10;
        do{
            System.out.println(c+1);
            c++;
        }while(c < 20);
        }
    }

