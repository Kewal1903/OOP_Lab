package Week4;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args){
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arrSize = sc.nextInt();
        float [] arr = new float [arrSize];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i< arrSize; i++)
            arr[i] = sc.nextFloat();
        System.out.println("The elements of the array are: ");
        for(int i = 0; i< arrSize; i++)
            System.out.println(arr[i]+ " ");
        for(int i = 0; i< arrSize; i++)
            sum = sum + arr[i];
        System.out.println("\n The sum is: "+sum);
    }
}
