package kh.project1.test1;

import java.util.Scanner;


public class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		for(int a=i;a>0;a--) {
			for(int b=a;b<i;b++) {
				System.out.print(" ");
			}
			for(int c=a;c>0;c--) {
				System.out.print("*");
			}
			System.out.println( );
		}
		
	}
}
