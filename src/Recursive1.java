public class Recursive1 {


    public void DigitGenerator(int n)
    {
        if (n>9)
        {
            return;
        }
        GeneratorHelper(n, 0);
    }


    public int GeneratorHelper (int n, int number)
    {
        if (number < Math.pow(10, n-1))
        {
            number = (int) Math.pow(10, n-1);
        }
        boolean strictlyIncreasing = false;
        while(!strictlyIncreasing)
        {
            if ((number % 10 > number/Math.pow(10,n-1)))
            {
                strictlyIncreasing = true;
                System.out.println(number);
            }
            else
            {
                number ++;
            }
        }

        if (number < Math.pow(10,n))
        {
            return GeneratorHelper(n, number+1);
        }
        else
        {
            return number;
        }


    }
}
