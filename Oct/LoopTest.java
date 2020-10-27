package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("반복할 횟수 : ");
//		int count = scan.nextInt(); 
//		
//		int i = 1;//초기식 _반복문 시작 전 해줘야한다.
//		
//		while(i <= count) { //조건식
//			System.out.println(i+"번째 반복");
//			i++; // 증감식
//		}
//		
		
//		System.out.print("반복할 횟수 : ");
//		int count = scan.nextInt(); 
//		
//		int i = 1;//초기식 _반복문 시작 전 해줘야한다.
//		
//		while(true) { //조건식
//			if(i >= count) break; //= 메서드 종료 or break; = 종료.본인제어문 제외한 제어문 한개 종료
//			System.out.println(i+"번째 반복");
//			i++; // 증감식
//		}
//		System.out.println("시스템 조욜 부분"); //break 부분에선 보이고 return일 땐 안보임
//		//return 일 때 오류 뜨는 데 이클립스 기능이다
		
		System.out.print("반복할 횟수 : ");
		int count = scan.nextInt(); //초기식 _반복문 시작 전 해줘야한다.	
		while(count > 0) { //조건식
			//= 메서드 종료 or break; = 종료.본인제어문 제외한 제어문 한개 종료
			System.out.println(count + "번째 반복");
			count--; // 증감식
		}
		System.out.println("프로그램 종료부분");
	}
}
