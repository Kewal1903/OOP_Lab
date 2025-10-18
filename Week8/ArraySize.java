package Week8;
import java.util.Scanner;
class ArrayOperations{
    private int[] array = new int[3];
    private int count = 0;
    public void readInputs(){
        Scanner sc = new Scanner(System.in);
        while(count < 3){
            System.out.println("Enter number to store in array: ");
            String input = sc.nextLine();
            try{
                int value = Integer.parseInt(input);
                array[count] = value;
                count++;
            }catch(NumberFormatException e){
                System.out.println("Wrong input. Please enter a numeric value.");
            }
        }
    }
    public void displayArray(){
        System.out.println("The array values are: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
public class ArraySize {
    public static void main(String[] args){
        ArrayOperations operations = new ArrayOperations();
        operations.readInputs();
        operations.displayArray();
    }
}
