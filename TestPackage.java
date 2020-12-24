import package1.A;
import package1.B;
public class TestPackage {
	
    	static String message = "Hello World!";
    	static String name = "Mark Sakaberg";
    	static String eat = "Brteakfast";
    	String company = "Facebook copertion";
    	public TestPackage() {
    		System.out.println(company + "12");
    	}
    	 public static void main(String[]args) {
    	Welcome(message);
    	Name(name);
    	Eat(eat);
    	TestPackage objT = new TestPackage();
    	A objA2 = new A();
    	B objB2 = new B();
    }
    public static void Welcome(String m) {
    	String text = "Hi";
    	System.out.print(text +" " + m);
    }
    public static void Name(String n) {
    	int age = 32;
    	System.out.println("Name is :"+ n +" Age id : " + age);
    }
    public static void Eat(String e) {
    	System.out.println("Food is :"+ e);
    }
}
