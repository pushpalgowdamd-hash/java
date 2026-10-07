package basic;

public class Student1 {
	
	 String name = "Hello" ;
	 int age = 10;
	
	 Student1() {
		System.out.println(name + age);
	}
	 Student1(int age) {
		System.out.println(name + age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj = new Student1();
		Student1 obj1 = new Student1(18);

	}

}
