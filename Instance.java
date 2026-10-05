package basic;

public class Instance {
	   int a ;
	   int b ;
	   int c = 25;
		void add(int a , int b) {
			this.a=a;
			this.b=b;

		}
		void add1() {
		System.out.println(a+b);
			
		}
		void add2(int c , int d) {
			System.out.println(c+d);
			System.out.println(this.c + d);
			
		}
		void add3(int e , int f) {
			a = e;
			b = f;	
			System.out.println(a+b);
		}
		
		public static void main(String[] args) {
			Instance obj = new Instance();
			obj.add(20, 30);
			obj.add1();
			obj.add2(100,200);
			obj.add3(20, 30);

		}
	}