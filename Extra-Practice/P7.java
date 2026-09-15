/*
1
1 2 1
1 3 3 1
1 4 6 4 1
*/

public class P7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }
            System.out.println();
        }
    }
}