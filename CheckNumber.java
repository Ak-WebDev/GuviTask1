//Program to check number is positive or negative
import java.util.*;
public class CheckNumber {
        public  static void main (String[] args){
            int n;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number: ");
            n= sc.nextInt();
            if(n>0){
                System.out.println(n+":" +"Number is positive");
            }
            else {
                System.out.println(n+":"+"Number is negative");
            }
        }
}
