package ภฬฤฺลื;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String a = String.valueOf(n);
		int size = a.length() / 2;
		int f1 = 0;
		int f2 = 0;
		for(int i=0; i<size; i++) {
			f1 += a.charAt(i)-'0';
		}
		for(int i=size; i<a.length(); i++) {
			f2 += a.charAt(i)-'0';
			
		}
		if(f1 == 6 && f2 == 6) {
			System.out.println("LUCKY");
		}
		else {
			System.out.println("READY");
		}

	}

}
