import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Scanner -- Datatype
    //Constuct -- System.in
    Scanner myObj = new Scanner(System.in);

    //Printf or Println
    System.out.println("Enter name:");
    String name = myObj.nextLine(); //nextline in string datatype with spacing allow

    // String input
    System.out.println("Enter your year of study:");
    int year = myObj.nextInt();

    // Numerical input
    System.out.println("What is your target GPA for this semester?:");
    double GPA = myObj.nextDouble();


    // Output input by user
    System.out.println("Welcome " + name + "!");
    System.out.println("Work Hard to achieve your target GPA of &.2f" + GPA + " this semester of your Year %d" + year + ".");
    //System.out.println("Work Hard to achieve your target GPA of &.2f this semester of your Year %d." ,GPA ,year );
  }
}