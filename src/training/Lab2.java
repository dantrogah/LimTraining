package training;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud1 = new Student("Janet", "123456789");
		Student stud2 = new Student("samuel", "987654321");
		
		stud1.enroll("Math151");
		stud1.enroll("Eng255");
		stud1.enroll("His211");
		
		System.out.println(stud1.toString());
		stud1.payTuition(600);
		System.out.println(stud1.toString());
		
		
		
	}

}

class Student{
	
	//Properties
	private static int ID = 100;
	private String userId;
	private String name;
	private String ssn;
	private String phone;
	private String city;
	private String state;
	private String email;
	private String courses = "";
	private static final double costOfCourse = 800;
	private double balance = 0;
	
	public Student(String name, String ssn){
		ID++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserId();
	}
	
	
	// getters and setters
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	private void setEmail(){
		email = name.toLowerCase() + "@something.com";
		System.out.println("Your email is " + email);
	}
	
	private void setUserId(){
		int max = 9000;
		int min = 1000;
		int rand = (min + (int) (Math.random() * (max-min)));
		userId = ID + "" + rand + ssn.substring(5);
		System.out.println("User ID: " + userId);
		
	}
	
	public void enroll(String course){
		this.courses =this.courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(double amount){
		balance -= amount;
		System.out.println("Payment: $" + amount);
	}
	
	public void checkBalance(){

		System.out.println("Balance: $" + balance );
		
	}
	
	public void showCourses(){
		
		System.out.println(courses);
	}
	
	public String toString(){
		return "[NAME: " + name + "\n" + "Courses: " + courses + "\nBalance $" + 
				balance + "]" ;
				
	}
	
}

















