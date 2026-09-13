//accept a number from the user and print the table of it till 10.

import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        System.out.print("Enter a number to print its table till 10: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i;
        for (i=1; i<=10; i++){
            System.out.println(a+ " X "+ i+ " = "+ i*a);
        }
    }
}