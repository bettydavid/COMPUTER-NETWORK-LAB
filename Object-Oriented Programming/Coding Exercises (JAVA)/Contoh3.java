import bentuk.*;
public class Contoh3 {
public static void main (String [ ] args) {
Bulatan a = new Bulatan(0,0,10);
SegiTigaTepat b = new SegiTigaTepat(4,3);
SegiEmpat c = new SegiEmpat(4,3);
System.out.println("Maklumat bentuk a");
a.paparMaklumat();
System.out.println("Luas : " + a.luas());
System.out.println("Maklumat bentuk b");
b.paparMaklumat();
System.out.println("Luas : " + b.luas());
System.out.println("Maklumat bentuk c");
c.paparMaklumat();
System.out.println("Luas : " + c.luas());
}
}
