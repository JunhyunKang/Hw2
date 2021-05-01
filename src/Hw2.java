public class Hw2 {
    public static void main(String[] args) {
        int n[][]={{1}, {1,2,3}, {1}, {1,2,3,4}, {1, 2}};
        int i;
        int j;
        for(i=0;i<n.length;i++)
        {
            for(j=0;j<n[i].length;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
