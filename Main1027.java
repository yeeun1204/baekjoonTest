package baekjoon;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		for(int a=1;a<=line;a++) {
			for(int sp=line;sp>=a+1;sp--) {
				System.out.print(" ");
			}
			
			for(int s=1;s <=(2*a-1);s++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		

	}

}
