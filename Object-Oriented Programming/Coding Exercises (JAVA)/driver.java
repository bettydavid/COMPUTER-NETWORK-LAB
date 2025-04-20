
//BEATRICE ANN DAVID (A23CS0055)

class Participant {
    private String name;
    private String type;
    private double registrationFee;

    Participant (String nam, String typ, double fee)
    {
       this.name = nam;
       this.type = typ;
       this.registrationFee = fee;
    }

    Participant() {
        this ("Anonymous", "Student", 50.00);
        System.out.println ("Participant Anonymous (Student) registered.");
        System.out.println ("Default participant registered.");


    }

    Participant (String nam, String typ)
    {
        this.name = nam;
        this.type = typ;

        if (type.equalsIgnoreCase("Student"))
        {
            registrationFee = 50.00;
            System.out.println("Participant Aisyah (Student) registered");

        }

        else{
            registrationFee = 150.00;
            System.out.println("Participant Mr.Halim registered with custom fee.");
        }
    }

   
 
    void displayDetails () {
        System.out.println("Name: " + name + ", Type: " +
type + ", Fee: RM" + String.format("%.2f", registrationFee));
 }
    }

public class driver {
     public static void main (String[] args){
        Participant p1 = new Participant();
        Participant p2 = new Participant("Aisyah", "Student");
        Participant p3 = new Participant("Mr. Halim", "Professional");

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();


     }


}
    
