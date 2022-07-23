package ภฬฤฺลื;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String n = input.next();
		int a=0;
		int result = 0;
		for(int i=0; i<n.length(); i++) {
			a = (Integer.valueOf(n.charAt(i)-'0'));
			if(a<=1 || result<=1) {
				result +=a;
			}
			else {
				result *=a;
				
			}
			
		}
		System.out.println(result);

	}
}