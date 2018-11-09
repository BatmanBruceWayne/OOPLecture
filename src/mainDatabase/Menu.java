package mainDatabase;

import java.util.Scanner;

import javax.swing.JFrame;

public class Menu extends JFrame{
	private Database database;	
	public Menu() {
		System.out.println("Chương trình quản lý sinh viên: ");
		database = new Database();
		database.chooseOptions();
	}
	
	public static void main(String args[]) {
		new Menu();
		//int control;
		
	}
}
