package basic;

class Str{
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
}
public class StringGet extends Str{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringGet obj = new StringGet();
		obj.setName("Christopher Nolan ");
		String out = obj.getName();
		System.out.println(out);

	}

}
