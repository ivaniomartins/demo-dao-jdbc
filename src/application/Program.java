package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("===TESTE 1 - FINDBYID ===");
	SellerDao sellerdao  = DaoFactory.createSellerDao();
	Seller seller = sellerdao.findById(3);
	System.out.println(seller);
     
	System.out.println("\n===TESTE 2 - FINDBYDEPERTMENT ===");
	Department department = new Department(2,null);
	List<Seller> list = sellerdao.findByDepartment(department);
	
	for (Seller obj : list ) {
		System.out.println(obj);
	}
	
	}

}
	