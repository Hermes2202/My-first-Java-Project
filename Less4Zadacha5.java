/*6. Найти в массиве чисел элементы с наибольшим и
        наименьшим значениями.*/
public class Less4Zadacha5 {
    public static void main(String[] args) {
        int[] array = {44, 29, 15, 76, 98};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
            min = array[i];
            }
        }
        System.out.println(min);

        for(int i = 0;i < array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
