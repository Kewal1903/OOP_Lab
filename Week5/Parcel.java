package Week5;
import java.util.Scanner;
class ParcelDetails {
    String customerName;
    String parcelID;
    double parcelWeight;

    public ParcelDetails(String customerName, String parcelID, double parcelWeight) {
        this.customerName = customerName;
        this.parcelID = parcelID;
        this.parcelWeight = parcelWeight;
    }

    public double calculateCharge() {
        double baseCharge = 32.50;
        if (parcelWeight <= 2) {
            return baseCharge;
        } else {
            double extraWeight = parcelWeight - 2;
            double extraCharge = extraWeight * 10.50;
            return baseCharge + extraCharge;
        }
    }
    public void displayParcelDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Parcel ID: " + parcelID);
        System.out.println("Parcel Weight: " + parcelWeight + " Kg");
        System.out.println("Total Charge: Rs " + calculateCharge());
    }
}

public class Parcel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of parcels: ");
        int n = sc.nextInt();
        sc.nextLine();
        ParcelDetails[] parcels = new ParcelDetails[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for parcel " + (i + 1) + ":");
            System.out.print("Customer Name: ");
            String customerName = sc.nextLine();
            System.out.print("Parcel ID: ");
            String parcelID = sc.nextLine();
            System.out.print("Parcel Weight (in Kg): ");
            double parcelWeight = sc.nextDouble();
            sc.nextLine();
            parcels[i] = new ParcelDetails(customerName, parcelID, parcelWeight);
        }
        System.out.println("\nParcel Details and Charges:");
        for (int i = 0; i < parcels.length; i++)
            parcels[i].displayParcelDetails();
        sc.close();
    }
}