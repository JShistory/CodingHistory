package ������;

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
		Arrays.sort(sort);            //�迭�� ������������ �����ѵڿ�
		for(int i=0; i<sort.length; i++) {
			if(sort[i] >='0' && sort[i]<= '9') {        //�迭���� 0~9������ ������
				sum +=Integer.valueOf(sort[i])-'0';       //sum�� �����ְ�
			}
			else {                                       //�ƴϸ� ������ְ�~
				System.out.print(sort[i]);
			}
		}
		System.out.print(sum);
	}

}
