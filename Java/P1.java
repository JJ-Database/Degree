import java.util.Scanner;

class Main2 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("-------------------Configuration: <Default>-------------------");
    System.out.println("Enter your age (years):");
    int year = myObj.nextInt();

    //Calculation
    int days = year*365;
    int hour = days*24;
    int minutes = hour*60;
    int seconds = minutes*60;

    // Output input by user
    System.out.println("Age in years: " + year + "years.");
    System.out.println("Age in days: " + days + "days.");
    System.out.println("Age in seconds: " + seconds + "seconds.");


 
  }
}