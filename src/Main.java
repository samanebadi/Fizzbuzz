public class Main
{
    public static void main(String[] args)
    {
        String[] output = new String[101];

        for(int i=1; i<101; i++)
        {
            output[i] = ((i % 3) == 0 ? "Fizz" : "") + ((i % 5) == 0 ? "Buzz" : "");
            if (output[i].isEmpty())
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(output[i]);
            }

        }
    }
}