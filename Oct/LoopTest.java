package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("�ݺ��� Ƚ�� : ");
//		int count = scan.nextInt(); 
//		
//		int i = 1;//�ʱ�� _�ݺ��� ���� �� ������Ѵ�.
//		
//		while(i <= count) { //���ǽ�
//			System.out.println(i+"��° �ݺ�");
//			i++; // ������
//		}
//		
		
//		System.out.print("�ݺ��� Ƚ�� : ");
//		int count = scan.nextInt(); 
//		
//		int i = 1;//�ʱ�� _�ݺ��� ���� �� ������Ѵ�.
//		
//		while(true) { //���ǽ�
//			if(i >= count) break; //= �޼��� ���� or break; = ����.������� ������ ��� �Ѱ� ����
//			System.out.println(i+"��° �ݺ�");
//			i++; // ������
//		}
//		System.out.println("�ý��� ���� �κ�"); //break �κп��� ���̰� return�� �� �Ⱥ���
//		//return �� �� ���� �ߴ� �� ��Ŭ���� ����̴�
		
		System.out.print("�ݺ��� Ƚ�� : ");
		int count = scan.nextInt(); //�ʱ�� _�ݺ��� ���� �� ������Ѵ�.	
		while(count > 0) { //���ǽ�
			//= �޼��� ���� or break; = ����.������� ������ ��� �Ѱ� ����
			System.out.println(count + "��° �ݺ�");
			count--; // ������
		}
		System.out.println("���α׷� ����κ�");
	}
}
