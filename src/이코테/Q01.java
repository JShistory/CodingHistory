package ภฬฤฺลื;

import java.util.*;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] guild = new int[n];
		int people = 0;
		int result = 0;
		
		for(int i=0; i<n; i++) {
			guild[i] = input.nextInt();
		}
		Arrays.sort(guild);
		for(int i=0; i<n; i++) {
			people+=1;
			if(guild[i] == people) {
				result+=1;
				people = 0;
			}
		}
		System.out.println(result);

	}

}