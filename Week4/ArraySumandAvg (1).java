package Week4;
import java.util.Arrays;
public class ArraySumandAvg {
    public static void main(String[] args){
        float sum = 0;
        float avg = 1;
        int [] arr = {12,67,87,34,90,23,67,88};
        System.out.println("Original array: "+Arrays.toString(arr));
        for(int i = 0; i<8;i++)
            sum = sum + arr[i];
        avg = sum/8;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avg);
    }
}
