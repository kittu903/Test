package main;

public class Constructor {
	public static void main(String[] args) {
		B b = new B();
	}
}

 class A{
	A(){
		System.out.println("in A");
	}
	
	static {
		System.out.println("static a");
	}
	static {
		System.out.println("static a1");
	}
	{
		System.out.println("non static a");
	}
}
 
 class B extends A{
	 B(){
	 System.out.println("in B");
	 }
	 
	 static {
			System.out.println("static B");
		}
	 {
			System.out.println("non static b");
		}
 }
