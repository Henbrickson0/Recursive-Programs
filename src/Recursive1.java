
public class Recursive1 {
    public static void main(String[] args) {
        Recursive1 test = new Recursive1();
        test.DigitGenerator(2);
    }

    public void DigitGenerator(int n) {
        if (n > 9) {
            return;
        }
        GeneratorHelper(n, 0);
    }


    public void GeneratorHelper(int n, int number) {
        if (number < Math.pow(10, n)) {
            for (int i = 0; i < number + 1; i++) {
                GeneratorHelper(n, number + i);
                System.out.println(number);
            }
        }

    }

}