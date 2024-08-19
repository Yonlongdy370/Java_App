package Array;

import java.util.Scanner;

public class Arrat_Update {

    static Scanner sc = new Scanner(System.in);

    // Createrint and Input
    static int[] Input(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value for position " + i + ":");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //Read And Output
    static void Output(int arr[], int n) {
        System.out.print("Here kyou have " + n + " " + "Number in array,There are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    //Menu
    static void Menu() {
        System.out.println(">-------> Menu <-------<");
        System.out.println("Enter Number of array.");
        System.out.println("Read Number from array.");
        System.out.println("Search Number in array.");
        System.out.println("Update an element.");
        System.out.println("Delete an element.");
        System.out.println("Insert an element.");
        System.out.println("Exits.->.");
    }

    //functoin Search Number of array
    static void Search(int arr[], int n) {
        int target;
        //boolean isFound = false;
        System.out.print("Enter Your Target:");
        target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.print("Found'" + target + "'in the position And Index'" + i + "'");
                //isFound = true;
                break;
            } else if (i == n - 1) {
                System.out.print("Search Not Found..!");
            }
        }
        System.out.println("");
    }

    static void Update(int arr[], int n) {
        Output(arr, n);
        int target;
        boolean isFound = false;
        System.out.println("There is all number.");
        System.out.print("Enter a number do you want to Update:");
        target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.print("Enter a value for position" + i + ":");
                arr[i] = sc.nextInt();
                System.out.print("Update . succesfull");
                isFound = true;
                break;
            } else if (i == n - 1) {
                System.out.print("Update Not Found..!");
            }
        }
    }

    static int Delete(int number[], int size) {
        int target;
        System.out.print("Enter a target Number :");
        target = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (number[i] == target) {
                for (int j = i; j < size - 1; j++) {
                    number[j] = number[j + 1];
                }
                return size - 1;
            } else if (i == size - 1) {
                System.out.println("");
            }
        }
        return size;
    }

    static int[] delete(int arr[], int n) {
        int new_arr[] = new int[n - 1];
        int target;
        System.out.print("Enter target:");
        target = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != target) {
                new_arr[j] = arr[i];
                j++;
            }
        }
        return new_arr;
    }
    static int SearchIndex(int arr[],int n,int target){
        for(int i=0;i<n;i++)
            if(arr[i] == target)
            return i;
        return -1;
    }
    
    static boolean ProcessDelete(int arr[],int n){
        int target;
        System.out.print("Enter a Target You Want to Delete:");
        target = sc.nextInt();
        if(SearchIndex(arr, n, target) > -1){
            arr = delete(arr, n);
            return true;
        }
        else 
            System.out.println("Sorry the target do you want to delete not found..!");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[40], op, n = 0;
        do {
            Menu();
            // Menu(1-8)
            System.out.println(">-------> INPUT <-------<");
            System.out.print("Please select one option:");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.print("How many Number do you want to create?");//Input size number of array
                    n = sc.nextInt();
                    arr = Input(n);
                }
                break;
                case 2: {
                    Output(arr, n);
                }
                break;
                case 3: {
                    Search(arr, n);
                }
                break;
                case 4: {
                    Update(arr, n);
                }
                break;
                case 5: {
                   arr = delete(arr, n);
                   n--;
                }
                break;
                case 6: {
                   if(ProcessDelete(arr, n))--n;
                }
                break;
                case 7: {

                }
                break;
                case 8: {

                }
                break;
            }
        } while (op != 8);
    }
}
