package ภฬฤฺลื;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(),m = input.nextInt();
		int[] balls = new int[n];
		int count=0;
		for(int i=0; i<balls.length; i++) {
			balls[i] = input.nextInt();
		}
		for(int i=0; i<balls.length; i++) {
			for(int j=i; j<balls.length; j++) {
				if(balls[i] == balls[j]) {
					continue;
				}
				else {
					count+=1;
				}
			}
		}
		System.out.println(count);

	}

}
