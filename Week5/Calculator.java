package Week5;
class Addition {
    int a, b;

    void addition() {
        this.a = 0;
        this.b = 0;
    }

    int addition(int a) {
        this.a = a;
        this.b = 0;
        return this.a + this.b;
    }

    int addition(int a, int b) {
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }

    int add_more(int num1) {
        return this.a + this.b + num1;
    }

    int add_more(int num1, int num2) {
        return this.a + this.b + num1 + num2;
    }
}
public class Calculator {
    public static void main(String[] args){
        Addition a1 = new Addition();
        a1.addition();
        System.out.println("Sum of 5 and 0 is: "+ a1.addition(5));
        System.out.println("Sum of 3 and 4 is: "+ a1.addition(3,4));
        System.out.println("Sum after adding 10 is: "+ a1.add_more(10));
        System.out.println("Sum after adding 7 and 8 is: "+ a1.add_more(7,8));
    }
}
