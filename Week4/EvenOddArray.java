package Week4;
import java.util.Scanner;
public class EvenOddArray {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arrSize = sc.nextInt();
        int [] arr = new int [arrSize];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arrSize; i++)
            arr[i] = sc.nextInt();
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < arrSize; i++)
            System.out.println(arr[i] + " ");
        if(arrSize % 2 != 0)
            sum = sum + arr[0] + arr[(arrSize-1)/2] + arr[arrSize-1];
        else
            sum = sum + arr[0] + arr[arrSize-1];
        System.out.println("\n The sum is: "+sum);
    }
}
