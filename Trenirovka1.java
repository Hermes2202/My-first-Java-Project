/**
 * Created by admin on 16.05.2016.
 */
public class Trenirovka1 {
    public static void main(String[]args){
        java.util.Scanner scanner = new java.util.Scanner( System.in );
        String da = "Welcome :)";
        String no = "Sorry you so yong :( ";
        System.out.println("Enter you name:");
        String name = scanner.nextLine();
        System.out.println("You name : " + name );

        System.out.println("Enter you age");
        int age = scanner.nextInt();
        System.out.println(age);
        if(age >= 18) {
            System.out.println(da);
        }else if(age < 18){
                System.out.println(no);
            }
        }

    }
