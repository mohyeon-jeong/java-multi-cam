package sample17_fileInOut;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		File file = new File("c:\\");
		
		// file researching
		String[] filelist = file.list();
		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		
		// divide files and folders
		File[] filelist1 = file.listFiles();
		for (int i = 0; i < filelist1.length; i++) {
			if (filelist1[i].isFile()) {
				System.out.println("[file]" + filelist1[i].getName());
			} else if (filelist1[i].isDirectory()) {
				System.out.println("[folder]" + filelist1[i].getName());
			} else {
				System.out.println("[?]" + filelist1[i].getName());
			}
		}
		
		// create file
		File newfile = new File("c:\\tmp\\newfile.txt");
		
		try {
			if (newfile.createNewFile()) {
				System.out.println("file creating completed");
			} else {
				System.out.println("file creating failed"); // 파일명 중복 시 출력(Exception 출력하지 않음)
			}
		} catch (IOException e) {
			e.printStackTrace(); // 잘못된 경로일 시 출력(failed는 출력하지 않음)
		}
		
		// 파일 존재 여부
		if (newfile.exists()) {
			System.out.println("file exists");
		} else {
			System.out.println("no file");
		}
		
		// read only setting
		newfile.setReadOnly();
		
		// delete file
		newfile.delete();
		
		// write (String)
		File f = new File("c:\\tmp\\iofile.txt");
		
		try {
			// 단순 쓰기
			FileWriter fWriter = new FileWriter(f);
			
			fWriter.write("hi\n");
			fWriter.write("fuck\n");
			fWriter.close(); // 각종 Reader, Writer 사용 시 마지막에 반드시 써줘야 함
			
			// 추가 쓰기
			FileWriter fWriter1 = new FileWriter(f, true);
			
			fWriter1.write("hi\n");
			fWriter1.close();
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			pw.println("hi");
			pw.print("fuck ");
			pw.println("you");
			pw.close();
			
			// read (String)
			// read character by character (잘 안씀)
			FileReader fr = new FileReader(f);
			
			int ch = fr.read();
			while (ch != -1) {
				System.out.print((char)ch);
				ch = fr.read();
			}
			
			// read sentence
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			// 여기서 바로 br.readLine()하면 아래 while문에서 첫줄만 계속 읽는 무한루프
			
			// while이 돌면서 line이 넘어가야 하기 때문에 이렇게 쓰는듯
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


















