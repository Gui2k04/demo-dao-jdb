package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		/*System.out.println("\n=== TEST 1: department insert ====");
		Department newDepartment = new Department(23, "Goias");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		/*System.out.println("\n=== TEST 2: department update ====");
		Department dep2 = departmentDao.findById(23);
		dep2.setName("Goias");
		departmentDao.update(dep2);
		System.out.println("Update completed");*/
		
		/*System.out.println("\n=== TEST 3: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}*/
		
		/*System.out.println("\n=== TEST 4: department findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);*/
		
		System.out.println("\n=== TEST 4: department delete ====");
		departmentDao.deleteById(23);
		System.out.println("Delete completed");
		
	}
}
