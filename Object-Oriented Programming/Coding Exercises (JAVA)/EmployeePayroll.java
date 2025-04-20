//NAME: BEATRICE ANN DAVID (A23CS0055)


import java.io.File;
import java.util.Scanner;


enum Position {
    INTERN (1000.00, 8.00),
    JUNIOR (2000.00, 12.00),
    SENIOR (3000.00, 18.00),
    MANAGER (5000.00, 25.00);

    double baseSalary, overtimeRate;

    Position (double bs, double or)
    {
        this.baseSalary = bs;
        this.overtimeRate = or;
    }
}

 class Employee {
    private String id;
    private int hoursWorked;
    private String name;
    private Position position;

    Employee (String i, Position p, int hW, String n)
    {
        this.id = i;
        this.hoursWorked = hW;
        this.name = n;
        this.position = p;
    }
 
    public  double calculateSalary()
    {   
        double salary = position.baseSalary;
        int Overtimehours = hoursWorked > 160 ? hoursWorked-160 : 0;
        salary = salary + (position.overtimeRate*hoursWorked);

        return salary;

    }

    public void displayRow ()
    {
        System.out.printf("| %-20s | %-7s | %-9s | %-5d | RM %8.2f |\n",
                name, id, position, hoursWorked, calculateSalary());
    }

   
       
        
    }



public class EmployeePayroll {

    public static void main(String[] args) {
        Employee [] employees = new Employee [30];
        int count = 0;

        try {
            Scanner sc = new Scanner (new File ("employees.txt"));
               while (sc.hasNextLine() && count < 30)
               {
                  String line = sc.nextLine();
                  String [] parts = line.split(" ",4);
                  String id = parts[0];
                  Position position = Position.valueOf(parts[1]);
                  int hours = Integer.parseInt(parts[2]);
                  String  name = parts[3];
                  employees[count++] = new Employee(id, position, hours, name);

               }

               sc.close();
        } catch (Exception e)
        {
            System.out.println("Error: Reading the file."+e);
            return;
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %-20s | %-7s | %-9s | %-5s | %-11s |\n", "Name", "ID", "Position", "Hours", "Salary");
        System.out.println("--------------------------------------------------------------------");


        for (int i = 0; i< count; i++)
        {
            employees[i].displayRow();
        }
        
    }
    
}
