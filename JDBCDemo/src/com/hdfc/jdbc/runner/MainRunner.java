package com.hdfc.jdbc.runner;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hdfc.jdbc.sir.db.Dept;
import com.hdfc.jdbc.sir.db.service.DeptService;

public class MainRunner {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		DeptService service = new DeptService();

		boolean flag = true;

		while (flag) {

			System.out.println("1. Add Dept");
			System.out.println("2. Update Dept");
			System.out.println("3. Delete Dept By Id");
			System.out.println("4. Display  Dept By Id");
			System.out.println("5. Display All Depts");
			System.out.println("0. Exit/Logout");

			int choice = scanner.nextInt();

			int count = 0;

			switch (choice) {
			case 1:

				Dept newDept = inputs();

				int insert = service.insert(newDept);
				System.out.println(insert + " record is inserted");

				/*
				 * Dept newDept = inputs();
				 * 
				 * count = service.insert(newDept); System.out.println(count +
				 * " record is inserted");
				 */

				break;
			case 2:

				Dept update = inputs();
				int update2 = service.update(update);
				System.out.println(update2 + " record is updated");

				/*
				 * Dept updateDept = inputs();
				 * 
				 * count = service.update(updateDept); System.out.println(count +
				 * " record is updated");
				 */
				break;
			case 3:

				Dept inputs = inputs();

				System.out.println("Enter Dno  to Delete Records");
				int deleteDno = scanner.nextInt();
				int deleteById = service.deleteById(deleteDno);
				System.out.println(deleteById + " Records Deleted");

				/*
				 * System.out.println("Enter Dno to Delete Record");
				 * 
				 * int deleteWithDno = scanner.nextInt();
				 * 
				 * count = service.deleteById(deleteWithDno);
				 * 
				 * System.out.println(count + " deleted ...");
				 */

				break;
			case 4:
				System.out.println("Enter Dno to select record");

				int select = scanner.nextInt();
				Dept selectById = service.selectById(select);

				if (selectById.getDno() > 0) {
					System.out.println(selectById);
				}

				/*
				 * System.out.println("Enter Dno to Select Record");
				 * 
				 * int selectWithDno = scanner.nextInt();
				 * 
				 * Dept dept = service.selectById(selectWithDno);
				 * 
				 * if (dept.getDno() > 0) { System.out.println(dept); }
				 */
				break;
			case 5:

				List<Dept> selectAll = service.selectAll();

				for (Dept dept3 : selectAll) {
					System.out.println(dept3);
				}

				/*
				 * List<Dept> list = service.selectAll();
				 * 
				 * for (Dept dept2 : list) {
				 * 
				 * System.out.println(dept2);
				 * 
				 * }
				 */

				break;

			case 6:

				/*
				 * flag = false;
				 * 
				 * System.out.println("Thank Visit Again..");
				 */

				flag = false;
				System.out.println("All the Quries completed");

				break;

			default:
				break;
			}

		}

	}

	public static Dept inputs() {

		System.out.println("Enter Dno");
		int dno = scanner.nextInt();
		System.out.println("Enter DName");
		String dname = scanner.next();
		System.out.println("Enter Location");
		String location = scanner.next();

		Dept dept = new Dept(dno, dname, location);

		return dept;

	}

}
