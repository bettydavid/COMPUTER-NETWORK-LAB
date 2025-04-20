import java.util.*;

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {//look at the enum size variable, there is only value for each variable, so just follow for this constructor
        this.abbreviation = abbreviation;//constant (enum) has value, you got to give constructor
    }

    public String getAbbreviation() {//accessor since we have both private above ( we want to access private stuff)
        return abbreviation;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size (SMALL, MEDIUM, LARGE, EXTRA_LARGE): ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);// to convert input (string) into enum type
        //Size size = Size.valueOf(input); another alternative way to convert input to enum type
        System.out.println("Size = " + size);
        System.out.println("Abbreviation = " + size.getAbbreviation());

        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job, your size chosen is same with the specified size");
        }
        in.close();
    }
}
