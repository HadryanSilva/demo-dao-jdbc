package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("------- TEST 1: delete -------");
        DepartmentDao department = DaoFactory.createDepartmentDao();
        System.out.print("Enter the id to delete: ");
        int id = read.nextInt();
        department.deleteById(id);
        System.out.println("Delete complete");
        System.out.println();





    }

}
