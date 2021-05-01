public class Hw12 {
    public static void main(String[] args) {
        int sum =0;
        for(int i =0; i<args.length;i++)
        {
            try{
                int a =Integer.parseInt(args[i]);
                sum = sum + a;
            }
            catch (NumberFormatException e)
            {
                continue;
            }
        }
        System.out.println(sum);
    }
}
