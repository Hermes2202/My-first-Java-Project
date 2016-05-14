
public class ZadachaPervaya {
    public static void main (String [] args){
        java.util.Scanner scanner = new java.util.Scanner( System.in );

        System.out.print( "Enter int: " ); // Просим пользователя ввести первое число
        int integer = scanner.nextInt();  //  Ввод первого числа Plus
        System.out.println( "You printed: " + integer ); //выводим на экран первое число

        System.out.print( "Enter integer 2: " ); // Просим пользователя ввести второе число
        int integer2 = scanner.nextInt();        // Ввод второго числа
        System.out.println( "You printed: " + integer2 );  // Выводим на экран второе число
        System.out.println(integer + integer2); // Plus first and second number;
        System.out.println(integer - integer2); // the difference between the first and second number
        System.out.println(integer / integer2); // Делим (Честно говоря не понимаю в данном случае значение слов : -
        System.out.println(integer * integer2); // Множим                             - "Произведение" и "Частное".
    }
}

