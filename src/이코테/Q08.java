package 이코테;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s =input.next();
		char[] sort = new char[s.length()];
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			sort[i] = s.charAt(i);
		}
		Arrays.sort(sort);            //배열을 오름차순으로 정렬한뒤에
		for(int i=0; i<sort.length; i++) {
			if(sort[i] >='0' && sort[i]<= '9') {        //배열에서 0~9에값이 나오면
				sum +=Integer.valueOf(sort[i])-'0';       //sum에 더해주고
			}
			else {                                       //아니면 출력해주고~
				System.out.print(sort[i]);
			}
		}
		System.out.print(sum);
	}

}
