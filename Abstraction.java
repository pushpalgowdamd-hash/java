package basic;

abstract class Atm
{
	abstract void withdraw();
	abstract void deposit();
}

public class Abstraction extends Atm {
	void withdraw()
	{
		System.out.println("WITHDRAW ");
	}
	void deposit()
	{
		System.out.println("DEPOSIT ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction obj = new Abstraction();	//object
		obj.withdraw();
		obj.deposit();

	}

}
