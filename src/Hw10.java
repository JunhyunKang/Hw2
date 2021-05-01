import java.util.Random;
public class Hw10 {
        public static void main(String[] args) {
            int[][] array = new int[4][4];
            Random random = new Random();
            int index_1, index_2;
            int[] check = new int[20];
            for(int i=0; i< 10; i++)
            {
                index_1= random.nextInt(4);
                index_2=random.nextInt(4);
                check[2*i]=index_1;
                check[2*i+1]=index_2;
                for(int j=0;j< 2*i;j+=2)
                {
                    if(check[j]==check[2*i]&&check[j+1]==check[2*i+1])
                    {
                        i--;
                        continue;
                    }
                }
                array[index_1][index_2]= random.nextInt(10)+1;
            }
            for(int i =0;i< array.length;i++)
            {
                for(int j=0; j< array[i].length;j++)
                    System.out.print(array[i][j]+"\t");
                System.out.println("");
            }
    }
}
