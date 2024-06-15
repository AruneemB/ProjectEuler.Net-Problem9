public class SpecialPythagoreanTriplet
{
    public static long productSpecialPythagoreanTriplet(int sum)
    {
        long a, b = 0, c = 0;

        for(a = 1; a < sum/3; a++)
        {
            b = (sum * (sum/2 - a)) / (sum - a);
            c = sum - a - b;

            if (a * a + b * b == c * c) break;
        }

        return a * b * c;
    }

    public static void main(String[] args)
    {
        System.out.println(productSpecialPythagoreanTriplet(1000));
    }

}
