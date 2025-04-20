public class LECh3a {
    enum Fruit {grape, apple, orange, lychee}

    public static void main (String[] args)
    {
        Fruit f1 = Fruit.grape;
        Fruit f2 = Fruit.orange;

        System.out.println("Ordinal value: " + f2.ordinal());
        System.out.println("Equals value: " + f1.equals(f2));
        System.out.println("Compare To value (1): " + f1.compareTo(f2));
        System.out.println("Compare To value (2): " + f2.compareTo(f1));



    }
}