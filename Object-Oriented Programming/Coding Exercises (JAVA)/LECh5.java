
//NAME: BEATRICE ANN DAVID A23CS0055
public class LECh5 {
   public static void main(String[] args) {
      int numArray [] = {4,5,2,8,9,10};//(i)
//(ii)
       System.out.println("All elements: ");
       for (int val: numArray)
       {
          System.out.print(val + " ");
       }
    
       System.out.println();
       System.out.println();
//(iii)
       for (int i = 0; i < numArray.length ; i++)
       {
          numArray[i] = numArray[i] + 5;

       }

       System.out.println("Elements from last element to the first element: ");
//(iv)
       for (int i = 5; i < numArray.length && i > -1; i--)
       {
           System.out.print(numArray[i] + " ");
       }

   }
}
