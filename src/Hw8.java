import java.util.Scanner;
import java.util.Random;
public class Hw8 {
    public static void main(String[] args) {
        System.out.print("정수 몇개?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        Random random = new Random();

        for(int i=0;i< array.length;i++)
        {
            array[i]= random.nextInt(100)+1;

            for (int j=0; j<i;j++)
            {
                if(array[i]==array[j])
                {
                    i--;
                    continue;
                }
            }

        }
        for(int i= 0; i<array.length;i++ )
        {
            System.out.print(array[i]+"\t");
            if(i%10==9)
                System.out.println("");
        }
        scanner.close();
    }
}
