//
//package Array;
//
//import java.util.Scanner;
//public class EmployeeManagement {
//    int id;
//    String name;
//    String sex;
//    double salary;
//    String address;
//
//    public EmployeeManagement(int id, String name, String sex, double salary, String address) {
//        this.id = id;
//        this.name = name;
//        this.sex = sex;
//        this.salary = salary;
//        this.address = address;
//    }
// 
//    static Scanner scanner = new Scanner(System.in);
//
//    static void inputEmployee(int id,int n,String name,String sex,double salary,String address) {
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//        System.out.print("Enter ID: ");
//        id = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//        System.out.print("Enter Name: ");
//        name = scanner.nextLine();
//        System.out.print("Enter Sex: ");
//        sex = scanner.nextLine();
//        System.out.print("Enter Salary: ");
//        salary = scanner.nextDouble();
//        scanner.nextLine(); // Consume newline
//        System.out.print("Enter Address: ");
//        address = scanner.nextLine();
//        }
//        //return arr;
//    }
//
////    static int Output(int arr[],int n){
////        System.out.print("Here kyou have " + n + " " + "Number in array,There are: ");
////        for (int i = 0; i < n; i++) { 
////            System.out.println("ID: " + id + ", Name: " + name + ", Sex: " + sex +
////                    ", Salary: " + salary + ", Address: " + address);
////        }
////            System.out.println("");
////    }
////    
//    static void OutputEmployee(int arr[], int n) {
//        System.out.print("Here kyou have " + n + " " + "Number in array,There are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
//    }
//
//    public static void searchEmployee(String searchKey, String searchValue) {
//        boolean found = false;
//        //for (Employee employee : employees) {
//            if (employee.id == Integer.parseInt(searchValue) ||
//                    employee.name.equalsIgnoreCase(searchValue) ||
//                    employee.sex.equalsIgnoreCase(searchValue) ||
//                    employee.salary == Double.parseDouble(searchValue) ||
//                    employee.address.equalsIgnoreCase(searchValue)) {
//                System.out.println("Found: " + employee.id + ", " + employee.name);
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("Employee not found.");
//        }
//    }
//
//    public static void sortEmployees(String sortKey) {
//        // Implement sorting logic based on sortKey
//        // For example, using comparable interface or custom comparator
//        System.out.println("Sorting not implemented yet.");
//    }
//
//    public static void updateEmployee(int id, String updatedData) {
//        // Implement update logic based on id and updatedData
//        System.out.println("Update function not implemented yet.");
//    }
//
//    public static void deleteEmployee(int id) {
//        // Implement delete logic based on id
//        System.out.println("Delete function not implemented yet.");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int arr[] = new int[100], op, n = 0;
//        int choice;
//
//        do {
//            System.out.println("\nMenu:");
//            System.out.println("1. Input Employee");
//            System.out.println("2. Output Employees");
//            System.out.println("3. Search Employee");
//            System.out.println("4. Sort Employees");
//            System.out.println("5. Update Employee");
//            System.out.println("6. Delete Employee");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    //arr = inputEmployee(id,name);
//                    inputEmployee(0, 0, name, sex, 0, address)
//                    break;
//                case 2:
//                    OutputEmployee(arr,n);
//                    break;
//                case 3:
//                    System.out.print("Enter search key (id, name, sex, salary, address): ");
//                String searchKey = scanner.next();
//                    System.out.print("Enter search value: ");
//                    String searchValue = scanner.next();
//                    searchEmployee(searchKey, searchValue);
//                    break;
//                case 4:
//                    System.out.print("Enter sort key (id, name, salary): ");
//                    String sortKey = scanner.next();
//                    sortEmployees(sortKey);
//                    break;
//                case 5:
//                    System.out.print("Enter employee ID to update: ");
//                    int updateId = scanner.nextInt();
//                    System.out.print("Enter updated data: ");
//                    String updatedData = scanner.next();
//                    updateEmployee(updateId, updatedData);
//                    break;
//                case 6:
//                    System.out.print("Enter employee ID to delete: ");
//                    int deleteId = scanner.nextInt();
//                    deleteEmployee(deleteId);
//                    break;
//                case 7:
//                    System.out.println("Exiting program...");
//                    break;
//                default:
//                    System.out.println("Invalid choice.");
//            }
//        } while (choice != 7);
//    }
//}
