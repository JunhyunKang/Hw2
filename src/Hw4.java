import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        char i;
        char j;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char alphabet = s.charAt(0);
        for(i=alphabet;i>=0x0061; i--)
        {
            for(j=0x0061;j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        scanner.close();
    }
}
