import java.util.Scanner;
import java.util.Arrays;

public class Java_Func_Array_prj {
    public static void display_All(String n[],int m[]){
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] +":"+" "+ m[i]);
        }
    }

    public static void avg_marks(int m[]){
        int tot = 0;
        int avg = 0;
        for (int i = 0; i < m.length; i++) {
            tot += m[i];
        }
        avg = tot/(m.length);
        System.out.println("The Average of all students marks is: "+avg);
    }

    public static void High_Low(int m[]){
        int high = 0;
        int low = 0;
        Arrays.sort(m);
        high = m[(m.length)-1];
        low = m[0];
        System.out.println("Highest marks: "+high);
        System.out.println("Lowest marks: "+low);
    }

    public static char grade(int m){
        char g = 'N';
        if(m>=90){
            g = 'A';
        }
        else if(m>=80 && m<=89){
            g = 'B';
        }
        else if(m>=70 && m<=79){
            g = 'C';
        }
        else if(m>=60 && m<=69){
            g = 'D';
        }
        else{
            g = 'F';
        }
        System.out.println("The Grade for "+m+" is "+g);
        return g;
    }

    public static void stud_info(String n, String nm[], int m[]) {
        for (int i = 0; i < nm.length; i++) {
            if (n.equals(nm[i])) {
                System.out.println(n + ": " + m[i] + " Grade: " + grade(m[i]));
                return;
            }
        }
        System.out.println("Student not found.");
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int nums = sc.nextInt();
        String names[] = new String[nums];
        int marks[] = new int[nums];

        System.out.println("Enter the students names and marks: ");
        for (int i = 0; i < nums; i++) {
            String nm = sc.next();
            names[i] = nm;
            int mrk = sc.nextInt();
            marks[i] = mrk;
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display all");
            System.out.println("2. Average marks");
            System.out.println("3. Highest & Lowest");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: display_All(names, marks); break;
                case 2: avg_marks(marks); break;
                case 3: High_Low(marks); break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.next();
                    stud_info(searchName, names, marks);
                    break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }

    }
}