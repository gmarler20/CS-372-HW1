
public class TestEmployee {
	public static void main(String[] args) {
		Employee TestEmployee1 = new Employee(1, "Jeff", "01/21/2017", "Manager", "John");
		Employee TestEmployee2 = new Employee();
		System.out.println("The first employees ID is " + TestEmployee1.GetID());
		System.out.println("The first employees name is " + TestEmployee1.GetName());
		System.out.println("The first employees hiredate is " + TestEmployee1.GetHireDate());
		System.out.println("The first employees position is " + TestEmployee1.GetPosition());
		System.out.println("The first employees boss is " + TestEmployee1.GetBoss());
		
		TestEmployee2.SetId(23);
		TestEmployee2.SetName("Cathy");
		TestEmployee2.SetHireDate("04/23/2008");
		TestEmployee2.SetPosition("General Manager");
		TestEmployee2.SetBoss("Jonathan");
		
		System.out.println("The second employees ID is " + TestEmployee2.GetID());
		System.out.println("The second employees name is " + TestEmployee2.GetName());
		System.out.println("The second employees hiredate is " + TestEmployee2.GetHireDate());
		System.out.println("The second employees position is " + TestEmployee2.GetPosition());
		System.out.println("The second employees boss is " + TestEmployee2.GetBoss());
	}

}
