import java.util.Scanner;
public class Hw14 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        OUTER:while(true)
        {
            System.out.print("과목 이름>>");
            String name = scanner.next();
            if(name.equals("그만"))
                return;
            for(int i =0 ; i<course.length; i++)
            {
                if(course[i].equals(name))
                {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    continue OUTER;
                }
            }
            System.out.println("없는 과목입니다.");
        }
    }
}
