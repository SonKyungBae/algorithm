package algorithm.n001;

import java.util.ArrayList;
import java.util.Scanner;

/*
생성자
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		Student std1 = new Student();
		
		std1.setNo("1");
		std1.setName("손경배");
		
		Student std2 = new Student();
		
		std2.setNo("2");
		std2.setName("김남진");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(std1);
		list.add(std2);
		
		Scanner sc = new Scanner(System.in);
		
		boolean condition = true;
		while (condition) {
			
			System.out.println("검색할 학생 이름을 입력하세요");			
			String input = sc.next();	
			
			for (Student std : list) {			
				if (input.equals(std.getName())) {				
					System.out.println(std.getName());
					condition = false;
					break;
				}
			}
				
			if (condition) {
				System.out.println("학생이 없습니다. 다시 검색하시겠습니까?");
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
