public class Calendar0 {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a year as a command-line argument.");
            return;
        }

      // int year = Integer.parseInt(args[0]);
	  int year = 2024;

	  
        isLeapYearTest(year);
        nDaysInMonthTest(year);
    }

    // Tests the isLeapYear function.
    private static void isLeapYearTest(int year) {
        String commonOrLeap;
        if (isLeapYear(year)) {
            commonOrLeap = "leap";
        } else {
            commonOrLeap = "common";
        }
        System.out.println(year + " is a " + commonOrLeap + " year");
    }

    // Tests the nDaysInMonth function.
    private static void nDaysInMonthTest(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days");
        }
    }

    // Returns true if the given year is a leap year, false otherwise.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Returns the number of days in the given month and year.
    public static int nDaysInMonth(int month, int year) {
        int days;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }
}
