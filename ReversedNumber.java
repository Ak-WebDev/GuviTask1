//Program to reverse a given number
import java.util.*;
public class ReversedNumber {
    public  static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n,revNum,digit;
        System.out.println("Enter a number: ");
        n= sc.nextInt();
        revNum=0;
        while (n>0){
            digit=n%10;
            revNum=revNum*10+digit;
            n=n/10;
            System.out.println("Reversed Number is:"+revNum);
        }

    }
}
