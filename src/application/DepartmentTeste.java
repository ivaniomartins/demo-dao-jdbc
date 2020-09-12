package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("===TESTE 1 - FINDBYID ===");
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n===TESTE 2 - FINDBYALL ===");

		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n===TESTE 3 - INSERT ===");

		Department department1 = new Department(null, "Games");
		departmentDao.insert(department1);
		System.out.println("Insert de novo registro: " + department1.getId());

		System.out.println("\n===TESTE 4 - UPDATE ===");
		Department dep1 = departmentDao.findById(1);
		dep1.setName("Informatica");
		departmentDao.update(dep1);
		System.out.println("Update completo");

		System.out.println("\n===TESTE 6 - DELETE ===");

		System.out.println("Entre com um ID: ");

		String n = sc.nextLine();

		departmentDao.deleteById(n);

		System.out.println("Delete completo");

		sc.close();

	}

}
