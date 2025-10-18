package Week5;
import java.util.Scanner;

class createComplex {
    int real, img;
    Scanner sc = new Scanner(System.in);

    void CreateComplex() {
        System.out.println("Enter real part of complex number: ");
        this.real = sc.nextInt();
        System.out.println("Enter imaginary part of complex number: ");
        this.img = sc.nextInt();
        System.out.println("Complex number is: " + this.real + "+" + this.img + "i");
    }

    void add(createComplex c1, int real) {
        int newReal = c1.real + real;
        System.out.println("Sum of complex number and real number is: " + newReal + "+" + c1.img + "i");
    }

    void add(createComplex c1, createComplex c2) {
        int newReal = c1.real + c2.real;
        int newImg = c1.img + c2.img;
        System.out.println("Sum of two complex numbers is: " + newReal + "+" + newImg + "i");
    }
}

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        createComplex c1 = new createComplex();
        createComplex c2 = new createComplex();

        c1.CreateComplex();
        c2.CreateComplex();
        System.out.println("Enter the real number to add: ");
        n = sc.nextInt();
        c1.add(c1, n);
        c1.add(c1, c2);
    }
}