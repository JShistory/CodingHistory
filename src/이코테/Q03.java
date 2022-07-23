package ภฬฤฺลื;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count0 = 0,count1 = 0;
		Scanner input = new Scanner(System.in);
		String s =input.next();
		int a =s.charAt(0)-'0';
		if(s.charAt(0)-'0' == 1) {
			count0 = 1;
		}
		else {
			count1 = 1;
		}
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) != s.charAt(i+1)) {
				if(s.charAt(i+1)-'0'==1) {
					count0 +=1;
				}
				else {
					count1 +=1;
				}
				
			}
			
		}
		if(count0 > count1) {
			System.out.println(count1);
		}
		else {
			System.out.println(count0);
		}

	}

}
