
/*Вывести на экран все числа от 1 до 100, которые
        делятся на 3 без остатка.  */
public class Less4zadacha2 {
    public static void main(String[] args) {
       int number = 1;
        while(number < 100){
        number++;
            if(number == 100) {
                break;
            }else if(number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
