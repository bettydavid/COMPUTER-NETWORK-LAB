class Teacher {
    private String name;
    private double hoursWorked;
    static final double RATE = 30.00;

//Constructors
    public Teacher (){

    }

    public Teacher (String name, double hW)
    {
        this.name = name;
        this.hoursWorked = hW;
    }

    public String getName(){ //accessors
        return name;
    }

    public double getHours(){
        return hoursWorked;
    }

    public void setName (String n) //mutators
    {
        name = n;
    }

    public void setHours (double hW)
    {
        hoursWorked = hW;
    }

  


}

public class TestTeacher{
    public static double computeRay(Teacher t)
    {   
          return Teacher.RATE * t.getHours();

    }

    public static void displaySalary (Teacher t)
    {
        System.out.println("Name: " + t.getName() + "\nHours worked: "+ t.getHours());
        System.out.printf("Salary: RM%.2f", computeRay(t));
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Teacher [] tArr = {new Teacher("Liza",10),
                           new Teacher("Abu",15),
                           new Teacher("Hamid",8),
                           new Teacher("Malik",2) };
        
        for (Teacher t: tArr)
        {
            displaySalary(t);
        }
    }

    
}
