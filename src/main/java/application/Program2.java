package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("------- TEST 1: findById -------");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = departmentDao.findById(3);
        System.out.println(department);
        System.out.println();

        /*
        System.out.println("------- TEST 1: delete -------");
        DepartmentDao department1 = DaoFactory.createDepartmentDao();
        System.out.print("Enter the id to delete: ");
        int id = read.nextInt();
        department1.deleteById(id);
        System.out.println("Delete complete");
        System.out.println();

        System.out.println("------- TEST 2: update -------");
        DepartmentDao newDepartment = DaoFactory.createDepartmentDao();
        newDepartment.findById(3);
        newDepartment.update();*/


    }

}
