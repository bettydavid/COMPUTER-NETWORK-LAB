import java.util.*;

enum WeddingPackage {
    FIRDAUSI(20000.00, 800,50.00), MARJAN(15000.00,600,25.00), NAIM(10000.00,400,20.00), MAWADAH(5000.00,200,3.00);

    private double priceService;
    private int noGuests;
    private double priceAddService;
    
    //Constructor that represt the values hold by the constants
    private WeddingPackage (double priceService, int noGuests, double priceAddService)
    {
        this.priceService =priceService;
        this.noGuests = noGuests;
        this.priceAddService = priceAddService;
    }

    public double getpriceService (){
        return priceService;
    }

    public int getnoGuests (){
        return noGuests;
    }

    public double getpriceAddService (){
        return priceAddService;
    }


}

public class Marriage {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("WELCOME, PEOPLE TO WEDDING IS GREAT PACKAGE: ");
        System.out.println();
        System.out.println("PACKAGE OFFERED: ");
        System.out.println();
        System.out.println("1.FIRDAUSI:\nRM 20000.00 for 800 guests in a tent with customized scallop and watercooler fan. Food is served.");
        System.out.println ("RM 50.00 per hour for traditional music and IWAM as DJ.");
        System.out.println("2.MARJAN: \nRM 15000.00 for 600 guests in a tent with fan.Buffet style with ice cream each.");
        System.out.println ("RM 25.00 per hour for sentimental music and Niki as DJ");

        System.out.println("3.NAIM:\nRM 10000.00 for 400 guests in a tent.Buffet style with 5 dishes.RM 20.00 per hour for music.");
        
        System.out.println("4.MAWADAH:\nRM 5000.00 for 200 guests in a tent. Buffet style with 3 dishes.RM 3.00 per gift for guest.");


               

        System.out.print("Enter the package name (FIRDAUSI, NAIM, MARJAN, or MAWADAH): ");



        System.out.print("Enter the package name (FIRDAUSI, NAIM, MARJAN, or MAWADAH): ");
        String input = in.next().toUpperCase();
        WeddingPackage selectedpackage = WeddingPackage.valueOf( input);//to convert input into enum type
        switch(input)
        {
            case "FIRDAUSI":
            case "MARJAN":
            case "NAIM":System.out.print("Enter the number of hour required in the additional services: ");
             break;
            case "MAWADAH": System.out.print("Enter the number of gift required in the additional services: ");
            break;
    
        }
        int input2 = in.nextInt();
        double total = selectedpackage.getpriceService()+(selectedpackage.getpriceAddService()*input2);
       System.out.println(".....RECEIPT........");
       System.out.println("Package selected: "+selectedpackage);
       System.out.println("Number of Guests: " + selectedpackage.getnoGuests());
       System.out.println("Base Price: RM "+ String.format("%.2f",selectedpackage.getpriceService()));
       System.out.println("Additional Service Rate: RM "+ String.format("%.2f",selectedpackage.getpriceAddService()));
       System.out.println("Total Charge: RM "+String.format("%.2f",total));

       
       in.close();
      

    }

    
}
