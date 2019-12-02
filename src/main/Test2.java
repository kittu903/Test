package main;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int i = s.nextInt();
//        s.nextLine();
        String name = s.nextLine(); 
        
        System.out.println(i*2);
        System.out.println(name); 
	}
}
