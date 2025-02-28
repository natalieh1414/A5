
import java.util.Scanner;

public class MonthDays {
	
	//defining variables
    private int month;
    private int year;

    //constructor for month and year objects
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    //method for returning number of days depending on month and if a leap year
    public int numberOfDays() {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:					//February
                if (isLeapYear())
                    return 29;
                else
                    return 28;
            default:				//all other months with 31 days
                return 31;
        }
    }

    //identifying if the year is a leap year
    private boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    public static void main(String[] args) {
    	//create scanner for user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        MonthDays monthDays = new MonthDays(month, year);
        int days = monthDays.numberOfDays();
        System.out.println(days + " days");

        scanner.close();
    }
}

