package algorithm.n001;

import java.util.ArrayList;
import java.util.Scanner;

/*
������
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		Student std1 = new Student();
		
		std1.setNo("1");
		std1.setName("�հ��");
		
		Student std2 = new Student();
		
		std2.setNo("2");
		std2.setName("�賲��");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(std1);
		list.add(std2);
		
		Scanner sc = new Scanner(System.in);
		
		boolean condition = true;
		while (condition) {
			
			System.out.println("�˻��� �л� �̸��� �Է��ϼ���");			
			String input = sc.next();	
			
			for (Student std : list) {			
				if (input.equals(std.getName())) {				
					System.out.println(std.getName());
					condition = false;
					break;
				}
			}
				
			if (condition) {
				System.out.println("�л��� �����ϴ�. �ٽ� �˻��Ͻðڽ��ϱ�?");
				Scanner sc2 = new Scanner(System.in);
				input = sc2.next();
				
				if (input.equals("y")) {
					condition = true;
				} else {
					condition = false;
				}
			}
		}
		
			
		
	}

}
