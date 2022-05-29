package Week3Day1;

public class Students {
	
	public Students() {
		System.out.println("Printing Default Constructor");
	}
	
	public Students(String collegeName) {
		System.out.println("College Name is: " + collegeName);
	}
	
	public int getStudentInfo(int id) {
		return id;
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID is: " + id);
		System.out.println("Name is: " + name);
	}
	public void getStudentInfo(String email, Long phoneNo) {
		System.out.println("EMail Address is: " + email);
		System.out.println("Phone Number is: " + phoneNo);
	}
	
	public static void main(String arg[]) {
		Students st = new Students("AGASDGA College");
		Students st1 = new Students();
		st1.getStudentInfo(3423433);
		st1.getStudentInfo(2328282, "Someone");
		st1.getStudentInfo("xxxx@gmail.com", 9897654332L);
	}
}
