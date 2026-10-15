public class Recursive5 {
    public static void main(String[] args) {
        System.out.println(ChocolateEater(20.0, 5.0, 2.0));
    }

    static double ChocolateEater(double money, double price, double wrap)
    {
        if (money <= 0 || money - price < 0)
        {
            return 1;
        }

        return ChocolateEater(money - price, price, wrap) + 1 + 1.0/wrap;



    }
}
