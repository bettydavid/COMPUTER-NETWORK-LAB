import java.util.Scanner;

public class LECh4{
    public static void main(String[] args) {
    
        Scanner keyboard  = new Scanner(System.in);
    
    double [] scores = new double [6];
    
    System.out.println(scores.length);
    
    //(iv)
    scores[0] = 5.6;
    scores[2] = 7.8;
    scores[5] = 10.2;
    scores[1] = keyboard.nextDouble();//(v)

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    keyboard.close();


    }
}