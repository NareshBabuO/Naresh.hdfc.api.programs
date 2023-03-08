package com.hdfc.jdbc.runner;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.hdfc.jdbc.entity.HospitalEntity;
import com.hdfc.jdbc.service.HospitalService;
import com.hdfc.jdbc.service.HospitalServiceImpl;

public class HospitalRunner {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HospitalService service = new HospitalServiceImpl();

		boolean flag = true;

		while (flag) {
			System.out.println("1. Add Hospital");
			System.out.println("2. update Hospital");
			System.out.println("3. delete Hospital");
			System.out.println("4. Get All Hospital");
			System.out.println("0.Exit/logout");

			int choice = scanner.nextInt();
			// int addEmployees = 0;

			switch (choice) {
			case 1:

				HospitalEntity hospitalEntity = inputs();

				int addEmployees = service.addEmployees(hospitalEntity);

				System.out.println(addEmployees + "Record Inserted..");
				break;

			case 2:

				HospitalEntity entity2 = inputs();

				int updateHospitalById = service.updateHospitalById(entity2);

				System.out.println(updateHospitalById + "Records Update");

				break;
			case 3:
				System.out.println("Enter id");
				int nextInt = scanner.nextInt();
				int deleteHospitalById = service.deleteHospitalById(nextInt);
				System.out.println(deleteHospitalById + "Reords deleted");

				break;
			case 4:
				List<HospitalEntity> list = service.getHospitalEntityDetails();
				Stream<HospitalEntity> stream1 = list.stream();
				stream1.forEach((entity) -> {
					System.out.println(entity);
				});
				break;
			case 5:
				flag = false;
				System.out.println("Thank  you");
				break;
			default:
				System.err.println("Invalid Display");
				break;
			}

		}
	}

	public static HospitalEntity inputs() {

		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter founder name");
		String founder = scanner.next();
		System.out.println("Enter Since");
		int since = scanner.nextInt();

		HospitalEntity hospitalEntity = new HospitalEntity(id, name, founder, since);

		return hospitalEntity;

	}

}
