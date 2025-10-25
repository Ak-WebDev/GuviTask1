//Program to calculate discount
import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0.0;

        if (amount < 500) {
            discount = 0;
        } else if (amount >= 500 && amount <= 1000) {
            discount = 0.10 * amount;   // 10% discount
        } else if(amount >1000){
            discount = 0.20 * amount;   // 20% discount
        }

        double finalAmount = amount - discount;

        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);

    }
}
