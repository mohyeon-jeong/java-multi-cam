package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dto.HumanDto;

public class AddressDao {
	
	// DAO : Data Access Object
	
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private HumanDto[] humanArr = new HumanDto[100];
	private int count;
	private int index = -1;
	
	public AddressDao() {
		count = 0;
	}
	
	public void insert() {
		System.out.println("지인 추가");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("주소 : ");
		String address = "";
		try {
			address = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("메모 : ");
		String memo = sc.next();
		
//		humanArr[0].setName(name);
//		humanArr[0].setAge(age);
//		humanArr[0].setPhone(phone);
//		humanArr[0].setAddress(address);
//		humanArr[0].setMemo(memo);
		
		humanArr[count] = new HumanDto(name, age, phone, address, memo);
		count++;
	}
	
	public void delete() {
		find();
		
		if (index == -1) {
			System.out.println("정보를 찾을 수 없음");
		} else {
			// delete
			humanArr[index].setName("");
			humanArr[index].setAge(0);
			humanArr[index].setPhone("");
			humanArr[index].setAddress("");
			humanArr[index].setMemo("");
			
			System.out.println("삭제 완료");
		}
	}
	
	public void select() {
		// 검색하여 해당 사람만 출력
		find();
		
		if (index == -1) {
			System.out.println("정보를 찾을 수 없음");
		} else {
			System.out.println(humanArr[index].toString());
		}
	}
	
	public void update() {
		// 수정
		// phone, address만
		find();
		
		if (index == -1) {
			System.out.println("정보를 찾을 수 없음");
		} else {
			System.out.println(humanArr[index].getName() + " 수정");
			
			System.out.print("전화번호 : ");
			String phone = sc.next();
			
			System.out.print("주소 : ");
			String address = "";
			try {
				address = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			humanArr[index].setPhone(phone);
			humanArr[index].setAddress(address);
			
			System.out.println("수정 완료");
		}
	}
	
	public void allDataPrint() {
		for (int i = 0; i < humanArr.length; i++) {
			if (humanArr[i] != null && humanArr[i].getName().equals("") == false)
				System.out.println(humanArr[i].toString());
		}
	}
	
	public void find() {
		System.out.print("검색할 지인의 이름 : ");
		String name = sc.next();
		
		index = -1;
		for (int i = 0; i < humanArr.length; i++) {
			if (humanArr[i] != null && name.equals(humanArr[i].getName())) {
				index = i;
				break;
			}
		}
	}
	
}
