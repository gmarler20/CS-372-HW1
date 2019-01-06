
public class Employee {
	private int ID;
	private String name;
	private String hiredate;
	private String position;
	private String boss;
	
	Employee() {
		ID = 0;
		name = "Default";
		hiredate = "1/3/2019";
		position = "null";
		boss = "null";
	}
	
	Employee(int id, String n, String hd, String p, String b) {
		ID = id;
		name = n;
		hiredate = hd;
		position = p;
		boss = b;
	}
	
	public void SetId (int id) {
		ID = id;
	}
	
	public int GetID () {
		return ID;
	}
	
	public void SetName(String nm) {
		name = nm;
	}
	
	public String GetName() {
		return name;
	}
	
	public void SetHireDate(String hd) {
		hiredate = hd;
	}
	
	public String GetHireDate() {
		return hiredate;
	}
	
	public void SetPosition(String p) {
		position = p;
	}
	
	public String GetPosition() {
		return position;
	}
	
	public void SetBoss(String b) {
		boss = b;
	}
	
	public String GetBoss() {
		return boss;
	}
	
	//PT -- consider overriding toString()
}
