/**
 * Created by admin on 15.05.2016.
 */
public class Zadacha$4Treugolnik {
    public static void main(String [] args){
        double sideA = 24.11;                                                   //создаем стороны треугольника
        double sideB = 15.3;
        double sideC = 42.41;
        double semiPerimeter =(sideA + sideB + sideC) / 2;                      //вычисляем полупериметр
        // по идее нам нужно S = \/^^ p *(p-a)*(p-b)*(p-c) gde: p =(a+b+c)/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter-sideC)); //вычисляем формулой Герона
        System.out.println( area );  // получаем неопределенное значение
                                    //  почему так еще пока  не понял, по идее должно поучится
                               
    }
}
