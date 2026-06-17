public class PrintAllPrime 
{
       public static void main(String[] args) 
    {
        int n = 20;
        for(int num = 2; num <= n; num++)
        {
            int count = 0;
            for(int i = 1; i <= num; i++)
            {
                if(num % i == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println(num);
            }
        }
    }
}