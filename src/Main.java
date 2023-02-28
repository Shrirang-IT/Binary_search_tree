import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Driver driver=new Driver();
        int choice=1 ;
        while(choice !=0) {
            System.out.println(" Case 1 : Insert");
            System.out.println(" Case 2 : In-order Display");
            System.out.println(" Case 3 : Pre-order Display");
            System.out.println(" Case 4 : Post-order Display");
            System.out.println(" Case 0 : Exit");
            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    driver.getdata();
                    driver.create();
                }
                case 2,3,4 -> driver.Display_all(choice);
                case 0 -> System.out.println("Thank-You !");
            }

        }

    }
}