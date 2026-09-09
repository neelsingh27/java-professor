// taking two numbers as input and adding them.

import java.util.Scanner;
public class P4{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.print("Enter another number: ");
        int b=s.nextInt();
        int result=(a+b);
        System.out.print("The sum of the two entered number is: "+result);
    }
}