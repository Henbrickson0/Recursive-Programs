public class Recursive5 {
    public static void main(String[] args) {
        System.out.println(ChocolateEater(3, wrapCount));
    }

    static double ChocolateEater(double money, double price, int wrap)
    {
        if (money - price < 0)
        {
            return 1;
        }
        if (WrapperCalculator(wrap, (int) (money/price))  == wrap)
        {
            return ChocolateEater(money - price, price, wrap) + 1 + 1.0/wrap;
        }

        return (ChocolateEater(money - price, price, wrap) + 1 + 1.0/wrap);
    }

    static int HowManyChocolates(int wrap, int wrapCount)
    {

    }
}
