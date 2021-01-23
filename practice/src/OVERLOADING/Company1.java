package OVERLOADING;

public class Company1 {
public static void main(String[] args) {
	
	Employee1 e1 = new Developer1();//upCasting
	e1.work(120, 12000);
	System.out.println();
	Developer1 d1 = (Developer1) e1;//a subclass instantiation or downCasting is mandatory for overloading 
	d1.work(20000);
	d1.work(121, 120001);
	System.out.println(e1.name);
	System.out.println(d1.name+" "+d1.id);
	
}
}
