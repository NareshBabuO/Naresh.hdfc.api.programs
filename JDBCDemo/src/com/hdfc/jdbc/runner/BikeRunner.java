package com.hdfc.jdbc.runner;

import java.util.List;
import java.util.Scanner;

import com.hdfc.jdbc.connection.BikeQuries;
import com.hdfc.jdbc.entity.BikeEntity;
import com.mysql.cj.jdbc.ha.ServerAffinityStrategy;

public class BikeRunner {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BikeQuries quries = new BikeQuries();

		boolean check = true;

		while (check) {
			System.out.println("1,Insert values into Bike");
			System.out.println("2, Update values into Bike");
			System.out.println("3,delete values from bike");
			System.out.println("4 select from bike using id");
			System.out.println("5 Display All from Bike");
			System.out.println("6 Exit/Logout");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				BikeEntity entity1 = inputs();

				int insert = quries.insert(entity1);

				System.out.println(insert + "new Records updated");
				break;
			case 2:

				BikeEntity entity2 = inputs();
				int updateById = quries.updateById(entity2);
				System.out.println(updateById + "Record is updated");
				break;
			case 3:
				BikeEntity entity3 = inputs();
				System.out.println("Enter id to delete records");
				int nextInt = scanner.nextInt();
				int deleteById = quries.deleteById(nextInt);
				System.out.println(deleteById + " records deleted");
				break;
			case 4:
				System.out.println("Enter id  to display values");
				int nextInt2 = scanner.nextInt();
				BikeEntity selectById = quries.selectById(nextInt2);
				System.out.println(selectById + " selected records displayed");
				break;
			case 5:
				List<BikeEntity> selectAll = quries.selectAll();
				for (BikeEntity bikeEntity : selectAll) {
					System.out.println(bikeEntity);
				}
					break;

					case 6:
						check=false;
						System.out.println("All the Quries Completed");
						break;
						default:
							break;
				
			}
		}
	}

	public static BikeEntity inputs() {

		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter BrandName");
		String brand = scanner.next();
		System.out.println("Enter ownerName");
		String ownerName = scanner.next();
		System.out.println("Enter Location");
		String location = scanner.next();

		BikeEntity bikeEntity = new BikeEntity(id, brand, ownerName, location);

		return bikeEntity;

	}
}
