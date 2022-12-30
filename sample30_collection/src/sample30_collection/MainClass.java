package sample30_collection;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/* 
			Collection : 수집(데이터, Object)
			
			List : 목록
				배열처럼 사용 가능한 List. 유동적 배열
				선형구조
				배열처럼 index로 접근 및 관리
				
				ArrayList
				검색 속도가 빠름
				
				LinkedList
				추가 / 삭제 속도가 빠름
				
			Map : 사전
				HashMap
				TreeMap
		 */
		
		// ArrayList
		ArrayList<String> arrList = new ArrayList<String>();
		
		// 추가
		arrList.add("Tigers");
		arrList.add("Eagles");
		arrList.add("Bears");
		
		// length of list
		System.out.println(arrList.size());
		
		// get
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(i + " : " + arrList.get(i)); // == arrList[i]
		}
		
		System.out.println();
		
		// 원하는 index로 add
		arrList.add(2, "Lions");
		
		System.out.println(arrList);
		
		// 삭제
		arrList.remove(1);
		System.out.println(arrList);
		
		// 검색
		int index = arrList.indexOf("Lions");
		System.out.println(index);
		
		// 없으면 -1
		index = arrList.indexOf("");
		System.out.println(index);
		
		// 수정
		String updateStr = "Twins";
		
		arrList.set(0, updateStr);
		System.out.println(arrList);
		
		System.out.println();
		
//		ArrayList<Human> list = new ArrayList<Human>();
		List<Human> list= new ArrayList<Human>(); // 이렇게 해도 됨
		
		Human[] human = new Human[3];
		human[0] = new Human("a", 24);
		human[1] = new Human("b", 25);
		human[2] = new Human("c", 21);
		
		// CRUD
		// add
		for (int i = 0; i < human.length; i++) {
			list.add(human[i]);
		}
		
		// for each로도 출력 가능
		for (Human h : list) {
			System.out.println("for each : " + h.toString());
		}
		
		System.out.println();
		
		// find and remove
		String name = "b";
		int findIndex = -1;
		
		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if (name.equals(h.getName())) {
				findIndex = i;
				break;
			}
		}
		list.remove(findIndex);
		System.out.println("after remove : " + list);
		
		System.out.println();
		
		// update
		Human updateHuman = new Human("d", 23);
		list.set(0, updateHuman);
		System.out.println("after update : " + list);
	}

}


















