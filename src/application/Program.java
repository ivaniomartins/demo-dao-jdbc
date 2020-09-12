package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("===TESTE 1 - FINDBYID ===");
		SellerDao sellerdao = DaoFactory.createSellerDao();
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);

		System.out.println("\n===TESTE 2 - FINDBYDEPERTMENT ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n===TESTE 3 - FINDBYALL ===");

		list = sellerdao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		/*
		 * System.out.println("\n===TESTE 4 - INSERT ===");
		 * 
		 * Seller sellers = new Seller(null, "Greg Newton", "grege@gmail.com", new
		 * Date(), 4000.00, department); sellerdao.insert(sellers);
		 * System.out.println("Insert de novo registro: " + sellers.getId());
		 */

		System.out.println("\n===TESTE 5 - UPDATE ===");
		seller = sellerdao.findById(1);
		seller.setName("Martha Wayne");
		sellerdao.update(seller);
		System.out.println("Update completo");

		System.out.println("\n===TESTE 6 - DELETE ===");

		System.out.println("Entre com um ID: ");

		int n = sc.nextInt();

		sellerdao.deleteById(n);
		;

		System.out.println("Delete completo");

		sc.close();
	}

}
