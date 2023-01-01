package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DTO.AccountDTO;

public class AccountDAO {
	
	Scanner sc = new Scanner(System.in);
	private List<AccountDTO> list = new ArrayList<AccountDTO>();
	private int index = 1;
	
	// CRUD
	public void insert() {
		System.out.println("<< 입력 >>");
		
		System.out.print("날짜(YY/MM/DD) : ");
		String date = sc.next();
		
		System.out.print("용도 : ");
		String use = sc.next();
		
		System.out.print("수입/지출 : ");
		String classify = sc.next();
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		System.out.print("메모 : ");
		String memo = sc.next();
		
		list.add(new AccountDTO(index, date, use, classify, money, memo));
		index++;
	}
	
	public void delete() {
		if (list.size() < 1) {
			System.out.println("내역 없음");
			return;
		}
		System.out.println("<< 삭제 >>");
		
		System.out.print("삭제할 내역의 index 번호 : ");
		int delIndex = sc.nextInt();
		list.remove(delIndex - 1);
		
		for (int i = 0; i < list.size(); i++) {
			if (delIndex < list.get(i).getIndex()) {
				list.get(i).setIndex(list.get(i).getIndex() - 1);
			}
		}
		index--;
	}
	
	// 검색
	// 다 하면 좋고 아니면 하고싶은것만
	// 해당 연도 월별 결산
	public void selectMonth() {
		System.out.println("미구현 ㅎ");
//		System.out.println("<< 연도별 월 결산 >>");
//		System.out.print("연도 입력(YY) : ");
//		String inputYear = sc.next();
//		
//		for (int i = 0; i < list.size(); i++) {
//			String[] date = list.get(i).getDate().split("/");
//			
//			if (date[0].equals(inputYear)) {
//				
//			}
//		}
	}
	
	// 수입 / 지출
	public void selectClassify() {
		System.out.println("<< 수입/지출 검색 >>");
		System.out.print("수입 / 지출 : ");
		String classify = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getClassify().equals(classify)) {
				System.out.println(list.get(i));
			}
		}
	}
	
	// 용도
	public void selectUse() {
		System.out.println("<< 용도 검색 >>");
		System.out.print("검색할 용도 : ");
		String use = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUse().equals(use)) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void search() {
		System.out.println("<< 검색 >>");
		System.out.println("1. 월별 결산");
		System.out.println("2. 수입/지출");
		System.out.println("3. 용도");
		
		System.out.print("번호 입력 : ");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			selectMonth();
			break;
		case 2:
			selectClassify();
			break;
		case 3:
			selectUse();
			break;
		}
	}
	
	public void history() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void menu() {
		while (true) {
			System.out.println();
			System.out.println("<< 가계부 >>");
			System.out.println("1. 입력");
			System.out.println("2. 삭제");
			System.out.println("3. 검색");
			System.out.println("4. 전체 내역");
			System.out.println("5. 종료");
			
			System.out.print("번호 입력 : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				search();
				break;
			case 4:
				history();
				break;
			case 5:
				return;
			}
			
		}
	}

}

















