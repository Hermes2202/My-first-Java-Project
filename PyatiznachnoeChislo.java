
public class PyatiznachnoeChislo {
    public static void main(String [] args){
        java.util.Scanner scanner = new java.util.Scanner( System.in );

        System.out.print( "Enter the five-digit number: " );

        String fiveCode = scanner.nextLine();
        char one  = fiveCode.charAt(0);
        char two = fiveCode.charAt(1);
        char three = fiveCode.charAt(2);
        char four = fiveCode.charAt(3);
        char five = fiveCode.charAt(4);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

    }
}

