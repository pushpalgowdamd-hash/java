class Demo {
	public Demo() {		// Constructor - belongs to object
		int b =100;
		System.out.println(b);
		
	}
	  void m1()  //method m1 - belongs to object
	  {
		  int a =10;
	      int c = 20;
		  System.out.println(a+c);
		  System.out.println(a-c);
		  System.out.println(a*c);
		  System.out.println(c/a);
	  }
	public static void main(String[] args) {	//main method - belongs to class
		Demo obj = new Demo();	//object
         obj.m1();		
	}
}