package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = DB.getConnection();
		DB.closeConnection();
		System.out.println("OK!");
	}

}
