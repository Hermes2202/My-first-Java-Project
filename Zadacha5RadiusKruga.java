/**
 * Created by admin on 15.05.2016.
 */
public class Zadacha5RadiusKruga {
    public static void main(String[] args)  {       // формула для вычисления окружности C=п*d
        int radius = 15;                 // переменная радиуса
        int diametr = radius * 2;       // диаметр круга
        double lenghtCircle = Math.PI * diametr;   // Variable double because Pi is fractional number // вычисляем с помочью метода Math.Pi
        System.out.println("Length our circle have : " + lenghtCircle);        // output on display length circle
    }
}
