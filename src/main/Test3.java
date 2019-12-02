package main;

public class Test3 {
	public static void main(String[] args) {
		
		int a =1;
		
		int b=2;
		
		boolean boo = false;
		for(int j=0;j<b;j++) {
			if(a<b)
				boo =true;
			
			if(boo)
				break;
			
			System.out.println("-------");
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==i)
					break;
				else {
					System.out.println("====i==="+i);
					System.out.println("====j==="+j);
				}
			}
		}
	}
}
