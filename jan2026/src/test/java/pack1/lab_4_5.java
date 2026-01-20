package pack1;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

//Main class
public class lab_4_5{
 
 
 
public static void writeToFile(HashMap<Integer, Employee> map, String filename) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(filename));  // overwrites the file
 
    for (Employee e : map.values()) {
        bw.write(e.getId() + ","
                + e.getName() + ","
                + e.getSalary() + ","
                + e.getDesignation() + ","
                + e.getInsuranceScheme());
        bw.newLine();
    }
 
    bw.close();   // important!
    System.out.println("File Written Successfully!");
}
 
 
public static void readFromFile(String filename) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(filename));
 
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
 
    br.close();
}
 
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<Integer, Employee> map = new HashMap<>();
 
            try {
                // 1) Input
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
 
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine().trim();
 
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
 
                System.out.print("Enter Designation: ");
                String designation = sc.nextLine().trim();
 
                // 2) Build employee & compute scheme
                Employee emp = new Employee(id, name, salary, designation);
                EmployeeServiceImpl service = new EmployeeServiceImpl();
                service.findInsuranceScheme(emp);
 
                // 3) Put in HashMap
                map.put(emp.getId(), emp);
 
                // 4) Write & Read file (CSV text)
                String file = "C:\\Users\\Tushar.2.Garg\\git\\Technical-testing\\jan2026\\src\\test\\java\\pack1\\checking...txt";
                writeToFile(map, file);
                readFromFile(file);
 
                // 5) Filter by scheme (simple search)
                System.out.print("\nEnter scheme to search: ");
                String scheme = sc.nextLine().trim();
                System.out.println("Employees under scheme: " + scheme);
                for (Employee e : map.values()) {
                    if (e.getInsuranceScheme() != null &&
                            e.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                        System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation());
                    }
                }
 
                // 6) Delete by id and persist again (optional)
                System.out.print("\nEnter Employee ID to delete: ");
                int delId = sc.nextInt();
                if (map.remove(delId) != null) {
                    System.out.println("Deleted employee " + delId);
                } else {
                    System.out.println("No employee found with id " + delId);
                }
                writeToFile(map, file);
 
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                sc.close();
            }
        
    }
}



	

