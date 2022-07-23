package ภฬฤฺลื;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] number = new int[n];
		int[] numbers = new int[1000];

		
		for(int i=0; i<number.length; i++) {
			number[i] = input.nextInt();
			
		}
		Arrays.sort(number);
		int target = 1;
		for(int i=0; i<number.length; i++) {
			if(target < number[i]) {
				break;
			}
			target +=number[i];
		}
		System.out.println(target);
	}

}
