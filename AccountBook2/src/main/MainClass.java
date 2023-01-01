package main;

import DAO.AccountDAO;

public class MainClass {

	public static void main(String[] args) {
		// Account Book : 가계부
		AccountDAO dao = new AccountDAO();
		
		// menu
		dao.menu();
	}

}
