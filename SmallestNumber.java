//Program to reverse a given number
import java.util.*;
public class SmallestNumber {
    public  static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter a number: ");
        num1= sc.nextInt();
        System.out.println("Enter a number: ");
        num2= sc.nextInt();
        System.out.println("Enter a number: ");
        num3= sc.nextInt();
        if ((num1<num2)&&(num1<num3)){
            System.out.println(num1+" " + "is smallest");
        } else if ((num2<num1)&&(num2<num3)) {
            System.out.println(num2+" " + "is smallest");
        }else {
            System.out.println(num3+" " + "is smallest");
        }

    }
}
