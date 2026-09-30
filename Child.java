package basic;

class Parent
{
	void Melanin()
	{
		System.out.println("I don't have Melanin");
	}
	
}

public class Child extends Parent {	   
	public static void main(String[] args) {
		Child obj = new Child();
		obj.Melanin();
	}
}
		