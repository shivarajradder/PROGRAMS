package OVERRIDING;

public class company {
public static void main(String[] args) {
employee e = new developer();// you can access only name attribute
// in overriding always subclass method invoked
developer d = new developer();// you can access both attributes name, id

	d.work();
	System.out.println(d.name+" "+d.id);
}
}
