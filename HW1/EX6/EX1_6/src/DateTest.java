
public class DateTest {
	public static void main(String[] args) {
		Date object1 = new Date(21, 5, 1998);
		System.out.println(object1.getYear());
		Date object2 = new Date();
		object2 = Date.Today();
		System.out.println(object2.getYear());
		System.out.println(object2.getMonth());
		System.out.println(object2.getDay());
		
		
		Date object3 = new Date (20, 2, 1998);
		Date object4 = new Date (25, 8, 2018);
		
		Date.DateDifference(object4, object3);
	
	}
}
