/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Domain.Employee;
import Domain.PrivateEmployee;
import Domain.PublicEmployee;
import Logica.LinkedList.LinkedList;
import Exceptions.ListException;
import Logica.DoubleLinkedCircularList.DoubleLinkedCircularList;
import Logica.DoublyLinkedList.DoublyLinkedList;

/**
 * @version1.0
 * @author Daniel Solano
 */
public class Algoritmos_Lab01_B16322 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListException {
        testLab1();
        testLab2();
        testJavaLinkedList();
        testLab3();
    }

    private static void testLab1() throws ListException {
        System.out.println("\n\n*************");
        System.out.println("*LINKED LIST*");
        System.out.println("*************\n\n");

        PublicEmployee publicEmployeeA = new PublicEmployee("Indefined", "101110111",
                "Adrian Hernandez Villanueva", "11111111", "Curridabat, SJ", 50, 3000);//0
        PublicEmployee publicEmployeeB = new PublicEmployee("Temporal", "202220222",
                "Vanesa Gamboa Fernandez", "22222222", "Pacayas, Cartago", 60, 3500);//1
        PublicEmployee publicEmployeeC = new PublicEmployee("Servicion Profesionales",
                "303330333", "Carolina Velazquez", "33333333", "Alajuela, Alajuela", 30, 5000);//2

        PrivateEmployee privateEmployeeA = new PrivateEmployee(true, "404440444",
                "Andrea Solano", "44444444", "El Roble, Puntarenas", 40, 3500);//3
        PrivateEmployee privateEmployeeB = new PrivateEmployee(false, "505550555",
                "Carlos Montoya", "55555555", "Siquirres, Limon", 35, 7000);//4

        LinkedList employeeList = new LinkedList();

        System.out.println("The employee List is Empty: " + employeeList.isEmpty() + "\n");

        employeeList.insert(publicEmployeeA);
        employeeList.insert(publicEmployeeB);
        employeeList.insert(publicEmployeeC);

        employeeList.insert(privateEmployeeA);
        employeeList.insert(privateEmployeeB);

        System.out.println("List Size: " + employeeList.getSize() + "\n");
        System.out.println("Fist element: " + employeeList.first().toString());
        System.out.println("Last element: " + employeeList.last().toString() + "\n");

//        System.out.println("Get position privateEmployeeB: " + employeeList.getPosition(privateEmployeeB));
//        PublicEmployee invalidCase = publicEmployeeA;
//        invalidCase.setName("Invalid Employee");
//        invalidCase.setAddress("Invalid Employee");
//        invalidCase.setContractType("Invalid Employee");
//        invalidCase.setPhone("Invalid Employee");
//        invalidCase.setDni("Invalid Employee");
//        invalidCase.setSalaryPerHour(-1);
//        invalidCase.setWorkedHours(-1);

        // Print  element and position
        int position = employeeList.getPosition(privateEmployeeA);
        System.out.println("The worker private a  is on the position: " + position);
        PrivateEmployee privateEmployeeData = (PrivateEmployee) employeeList.getNode(position);
        System.out.println("Data of worker private a, are: " + privateEmployeeData.toString() + " -Name: " + privateEmployeeData.getName() + " -DNI: " + privateEmployeeData.getDni());

        employeeList.delete(publicEmployeeC);
        System.out.println("\n\nPublic Employee C Deleted.\n");
        System.out.println("Public Employee C exist? :" + employeeList.isElement(publicEmployeeC));

        System.out.println("\n\nIMPRIMIMOS LOS ELEMENTOS EN LA LISTA.\n");
        for (int i = 0; i < employeeList.getSize(); i++) {
            System.out.println(employeeList.getNode(i).toString());

        }

        employeeList.cancel();
        System.out.println("\nCanceled List");
        System.out.println("List is Empty? " + employeeList.isEmpty());

        LinkedList numericList = new LinkedList();
        numericList.ordererInsert(42);
        numericList.ordererInsert(8);
        numericList.ordererInsert(2);
        numericList.ordererInsert(5);
        numericList.ordererInsert(9);
        numericList.ordererInsert(12);
        String out = "";
        for (int i = 0; i < numericList.getSize(); i++) {
            out += " [ " + numericList.getNode(i) + " ] ";
        }
        System.out.println("\n\nnnumericList using ordererInsert: " + out);
    }

    private static void testLab2() throws ListException {
        System.out.println("\n\n*******************");
        System.out.println("*DOUBY LINKED LIST*");
        System.out.println("*******************\n\n");

        PublicEmployee publicEmployeeA = new PublicEmployee("Indefined", "101110111",
                "Adrian Hernandez Villanueva", "11111111", "Curridabat, SJ", 50, 3000);//0
        PublicEmployee publicEmployeeB = new PublicEmployee("Temporal", "202220222",
                "Vanesa Gamboa Fernandez", "22222222", "Pacayas, Cartago", 60, 3500);//1
        PublicEmployee publicEmployeeC = new PublicEmployee("Servicion Profesionales",
                "303330333", "Carolina Velazquez", "33333333", "Alajuela, Alajuela", 30, 5000);//2

        PrivateEmployee privateEmployeeA = new PrivateEmployee(true, "404440444",
                "Andrea Solano", "44444444", "El Roble, Puntarenas", 40, 3500);//3
        PrivateEmployee privateEmployeeB = new PrivateEmployee(false, "505550555",
                "Carlos Montoya", "55555555", "Siquirres, Limon", 35, 7000);//4

        DoublyLinkedList doublyLinkedEmployeeList = new DoublyLinkedList();

        System.out.println("The employee List is Empty: " + doublyLinkedEmployeeList.isEmpty() + "\n");

        doublyLinkedEmployeeList.insert(publicEmployeeA);
        doublyLinkedEmployeeList.insert(publicEmployeeB);
        doublyLinkedEmployeeList.insert(publicEmployeeC);

        doublyLinkedEmployeeList.insert(privateEmployeeA);
        doublyLinkedEmployeeList.insert(privateEmployeeB);

        System.out.println("List Size: " + doublyLinkedEmployeeList.getSize() + "\n");
        System.out.println("Fist element: " + doublyLinkedEmployeeList.first().toString());
        System.out.println("Last element: " + doublyLinkedEmployeeList.last().toString() + "\n");



        // Print  element and position
        int position = doublyLinkedEmployeeList.getPosition(privateEmployeeA);
        System.out.println("The worker private a  is on the position: " + position);
        PrivateEmployee privateEmployeeData = (PrivateEmployee) doublyLinkedEmployeeList.getNode(position);
        System.out.println("Data of worker private a, are: " + privateEmployeeData.toString() + " -Name: " + privateEmployeeData.getName() + " -DNI: " + privateEmployeeData.getDni());
        doublyLinkedEmployeeList.delete(publicEmployeeC);
        System.out.println("\n\nPublic Employee C Deleted.\n");
        System.out.println("Public Employee C exist? :" + doublyLinkedEmployeeList.isElement(publicEmployeeC));

        System.out.println("\n\nIMPRIMIMOS LOS ELEMENTOS EN LA LISTA.\n");
        for (int i = 0; i < doublyLinkedEmployeeList.getSize(); i++) {
            System.out.println(doublyLinkedEmployeeList.getNode(i).toString());

        }
        doublyLinkedEmployeeList.cancel();
        System.out.println("\nCanceled List");
        System.out.println("List is Empty? " + doublyLinkedEmployeeList.isEmpty());
    }

    private static void testJavaLinkedList() {
        System.out.println("\n\n******************");
        System.out.println("*JAVA LINKED LIST*");
        System.out.println("******************\n\n");

        java.util.LinkedList<Employee> employeeList = new java.util.LinkedList<Employee>();
        PublicEmployee publicEmployeeA = new PublicEmployee("Indefined", "101110111",
                "Adrian Hernandez Villanueva", "11111111", "Curridabat, SJ", 50, 3000);//0
        PublicEmployee publicEmployeeB = new PublicEmployee("Temporal", "202220222",
                "Vanesa Gamboa Fernandez", "22222222", "Pacayas, Cartago", 60, 3500);//1
        PublicEmployee publicEmployeeC = new PublicEmployee("Servicion Profesionales",
                "303330333", "Carolina Velazquez", "33333333", "Alajuela, Alajuela", 30, 5000);//2

        PrivateEmployee privateEmployeeA = new PrivateEmployee(true, "404440444",
                "Andrea Solano", "44444444", "El Roble, Puntarenas", 40, 3500);//3
        PrivateEmployee privateEmployeeB = new PrivateEmployee(false, "505550555",
                "Carlos Montoya", "55555555", "Siquirres, Limon", 35, 7000);//4

        employeeList.add(publicEmployeeA);
        employeeList.add(publicEmployeeB);
        employeeList.add(publicEmployeeC);

        employeeList.add(privateEmployeeA);
        employeeList.add(privateEmployeeB);
        for (Employee s : employeeList) {
            System.out.println(s.toString());
        }
    }

    private static void testLab3() throws ListException {
        System.out.println("\n\n****************************");
        System.out.println("*DOUBY LINKED CIRCULAR LIST*");
        System.out.println("****************************\n\n");

        PublicEmployee publicEmployeeA = new PublicEmployee("Indefined", "101110111",
                "Adrian Hernandez Villanueva", "11111111", "Curridabat, SJ", 50, 3000);//0
        PublicEmployee publicEmployeeB = new PublicEmployee("Temporal", "202220222",
                "Vanesa Gamboa Fernandez", "22222222", "Pacayas, Cartago", 60, 3500);//1
        PublicEmployee publicEmployeeC = new PublicEmployee("Servicion Profesionales",
                "303330333", "Carolina Velazquez", "33333333", "Alajuela, Alajuela", 30, 5000);//2

        PrivateEmployee privateEmployeeA = new PrivateEmployee(true, "404440444",
                "Andrea Solano", "44444444", "El Roble, Puntarenas", 40, 3500);//3
        PrivateEmployee privateEmployeeB = new PrivateEmployee(false, "505550555",
                "Carlos Montoya", "55555555", "Siquirres, Limon", 35, 7000);//4

        DoubleLinkedCircularList employeeList = new DoubleLinkedCircularList();

        System.out.println("The employee List is Empty: " + employeeList.isEmpty() + "\n");

        employeeList.insert(publicEmployeeA);
        employeeList.insert(publicEmployeeB);
        employeeList.insert(publicEmployeeC);

        employeeList.insert(privateEmployeeA);
        employeeList.insert(privateEmployeeB);

        System.out.println("List Size: " + employeeList.getSize() + "\n");
        System.out.println("Fist element: " + employeeList.first().toString());
        System.out.println("Last element: " + employeeList.last().toString() + "\n");

//        System.out.println("Get position privateEmployeeB: " + employeeList.getPosition(privateEmployeeB));
//        PublicEmployee invalidCase = publicEmployeeA;
//        invalidCase.setName("Invalid Employee");
//        invalidCase.setAddress("Invalid Employee");
//        invalidCase.setContractType("Invalid Employee");
//        invalidCase.setPhone("Invalid Employee");
//        invalidCase.setDni("Invalid Employee");
//        invalidCase.setSalaryPerHour(-1);
//        invalidCase.setWorkedHours(-1);

        // Print  element and position
        int position = employeeList.getPosition(privateEmployeeA);
        System.out.println("The worker private a  is on the position: " + position);
        PrivateEmployee privateEmployeeData = (PrivateEmployee) employeeList.getNode(position);
        System.out.println("Data of worker private a, are: " + privateEmployeeData.toString() + " -Name: " + privateEmployeeData.getName() + " -DNI: " + privateEmployeeData.getDni());

        employeeList.delete(publicEmployeeC);
        System.out.println("\n\nPublic Employee C Deleted.\n");
        System.out.println("Public Employee C exist? :" + employeeList.isElement(publicEmployeeC));

        System.out.println("\n\nIMPRIMIMOS LOS ELEMENTOS EN LA LISTA.\n");
        for (int i = 0; i < employeeList.getSize(); i++) {
            System.out.println(employeeList.getNode(i).toString());

        }
        employeeList.cancel();
        System.out.println("\nCanceled List");
        System.out.println("List is Empty? " + employeeList.isEmpty());

    }

}
