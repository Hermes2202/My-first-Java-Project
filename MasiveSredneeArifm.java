//Array srednee arifmetichesskoe
public class MasiveSredneeArifm {
    public static void main(String[] args){
        int [] array = {22,76,89,98,34,15};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum  += array [i];
        }
        System.out.println(sum / array.length);
    }
}
