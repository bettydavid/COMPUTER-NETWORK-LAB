public class Tut4Q9 {
    public static void printAll (double [] arr){
        for (double a: arr)
        {
            System.out.print(a + " ");
        }
        System.out.println();
        
    }

    public static void increaseAll (double [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] +=5;
        }
    }

    public static double findSmallest (double [] arr)
    {
        double small = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < small)
            {
                small = arr[i];

            }
        }

        return small;
    }
    public static void main (String[]  args) {
        
        double [] realArray = {4.2, 6.5, 2.3, 8.7, 3.9, 1.4};
        System.out.print("Original array: ");
        printAll(realArray);
        increaseAll(realArray);
        System.out.print("Updated array: ");
        printAll(realArray);
        System.out.print("The smallest value in the array: " +  findSmallest(realArray));
        System.out.println();


    }
    
}
