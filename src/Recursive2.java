public class Recursive2 {

    public static void main(String[] args) {
       System.out.println( SummationGenerator(3,4));
    }

    public static int SummationGenerator(int m, int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (m == 1 && n > 1)
        {
            return SummationGenerator(1, n-1) + n;
        }
        else if (n > 1 && m > 1)
        {
            return SummationGenerator(m - 1, n) + SummationGenerator(m,n-1);
        }

        return n;
    }
}
