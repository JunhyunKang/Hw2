import java.util.Scanner;
public class Hw6 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하시오>>");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int number;
        int i;
        for(i=0; i< unit.length;i++)
        {
            number=money/unit[i];
            if(number!=0)
                System.out.println(unit[i]+"원 짜리 : "+number+"개");
            money = money-number*unit[i];
        }
        scanner.close();
    }
}
