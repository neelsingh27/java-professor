//Taking 1 number as an input and displaying it.

import java.util.Scanner;

public class P3{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("You entered "+num);
    }
}