package Week4;
import java.util.Arrays;
public class SortedArray {
    public static void main(String[] args){
        int [] arr = {12,67,87,34,90,23,67,88};
        System.out.println("Original array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
