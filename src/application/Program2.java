package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
	DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
	
	System.out.println("\n=== TEST 1: seller insert ====");
	Department newDepartment = new Department(23, "Goias");
	departmentDao.insert(newDepartment);
	System.out.println("Inserted! New id = " + newDepartment.getId());
	}
}
