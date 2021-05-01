import java.util.Scanner;
public class Hw16 {
    public static void main(String[] args) {
        String[] str= {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        int a=0;
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true)
        {
            System.out.print("가위 바위 보!>>");
            String answer = scanner.next();
            if(answer.equals("그만"))
            {
                System.out.println("게임을 종료합니다...");
                return;
            }
            int n = (int)(Math.random()*3);
            if(answer.equals("가위"))
                a=0;    
            if(answer.equals("바위"))
                a=1;
            if(answer.equals("보"))
                a=2;
            if(a==n)
                System.out.println("사용자 = "+answer+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
            if(a==(n+1)%3)
                System.out.println("사용자 = "+answer+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
            if(a==(n+2)%3)
                System.out.println("사용자 = "+answer+" , 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
        }
    }
}
