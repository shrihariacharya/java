package com.jdbc.userManagment;

import java.sql.SQLException;
import java.util.Scanner;

import managedao.UserDao;
import managedaoimpl.UserDaoImpl;

public class App {
	public static void main(String[] args) {

		UserDao us = new UserDaoImpl();

		System.out.println("1. To Create User:");
		System.out.println("2. To View User:");
		System.out.println("3. To View all User:");
		System.out.println("4. To Update User:");
		System.out.println("5. To Delete User:");
		System.out.println("6. To Exit:");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice :");
			int ch = scan.nextInt();
			int i;
			switch (ch) {
			case 1: {
				i = us.insertUser(2, "'Shri'", "'Hii'", "'Latur'");
				System.out.println(i + " record inserted..");
				break;
			}
			case 2:
				us.displayUser(1);
				break;

			case 3:
				us.displayAllUser();
				break;

			case 4: {
				i = us.updateUser(2, "Shrihari");
				System.out.println(i + " record updated..");
				break;
			}

			case 5: {
				i = us.deleteUser(49);
				System.out.println(i + " record deleted..");
				break;
			}

			case 6:
				System.out.println("Exited..");
				System.exit(0);

			default:
				System.out.println("Enter valid choice...");

			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}