package basic;
interface Upper
{
	void add();
}

public class Interface implements Upper {
	public void add()
	{
		System.out.println("Hello ! ");
		System.out.println(6+5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.add();
	}
}
