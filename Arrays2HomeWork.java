package org.learning;
import java.util.Arrays;
public class Arrays2HomeWork {
    public static void main(String[] args){
        int [] original = {5,6,9,12,89,};
        int elementFst = original[0];
        int elementLst = original[original.length -1];  // узнали длинну масива (соответсвенно и последний элемент);
        int[]copy = new int[original.length];           // array  length => original;
        System.arraycopy(original,1,copy,1,original.length-2);
        copy[copy.length-1]= elementFst;
        copy[0] = elementLst;
        String Copy1 = Arrays.toString(copy);
        System.out.println(Copy1);







    }
}
