// Testing how the removal of any of the for loop component affects the output.

public class P6{
    public static void main(String[] args){
        int i=5;
        for (;;i--)     //Infinite loop
            System.out.println(i);
    }
}