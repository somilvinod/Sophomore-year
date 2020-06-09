import java.util.Scanner;
public class DayOfTheWeekProgramSomilVinod {

    public static void main (String[] args) {
        String calendarDate;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date in the form mm/dd/yyyy: ");
        calendarDate = input.next();

        String lastTwoDigitsYear = calendarDate.substring(8, 10);
        String lastFourDigitsYear = calendarDate.substring(6, 10);
        int lastTwoDigitsYearInt = Integer.parseInt(lastTwoDigitsYear);
        int yearDivideFour = lastTwoDigitsYearInt/4;

        Boolean leapYear = IsLeapYear(lastFourDigitsYear);

        int centuryValue = CenturyKeyValue(calendarDate.substring(6, 10));

        String month = calendarDate.substring(0, 2);
        int monthInt = MonthKeyValue(month, leapYear);

        String dayOfMonth = calendarDate.substring(3, 5);
        int dayOfMonthInt = Integer.parseInt(dayOfMonth);

        int totalSum = lastTwoDigitsYearInt + yearDivideFour + centuryValue + monthInt + dayOfMonthInt;
        int totalSumKeyValue = totalSum%7;
        String dayOfTheWeek = SumKeyValue(totalSumKeyValue);

        System.out.println(calendarDate + " fell on a " + dayOfTheWeek);


    }

    public static int CenturyKeyValue (String n) {
        int centuryInt = Integer.parseInt(n);
        if (centuryInt >= 1700 && centuryInt <= 1799) {
            return 2;
        }
        if (centuryInt >= 1800 && centuryInt <= 1899) {
            return 0;
        }
        if (centuryInt >= 1900 && centuryInt <= 1999) {
            return 5;
        }
        if (centuryInt >= 2000 && centuryInt <= 2099) {
            return 4;
        }
        if (centuryInt >= 2100 && centuryInt <= 2199) {
            return 2;
        }
        return -1;
    }

    public static int MonthKeyValue (String n, boolean leapYear) {
        int monthInt = Integer.parseInt(n);
        if (monthInt == 1) {
            if (leapYear)
                return 2;
            else return 3;
        }
        if (monthInt == 2) {
            if (leapYear)
                return 5;
            return 6;
        }
        if (monthInt == 3) { return 6; }
        if (monthInt == 4) { return 2; }
        if (monthInt == 5) { return 4; }
        if (monthInt == 6) { return 0; }
        if (monthInt == 7) { return 2; }
        if (monthInt == 8) { return 5; }
        if (monthInt == 9) { return 1; }
        if (monthInt == 10) { return 3; }
        if (monthInt == 11) { return 6; }
        if (monthInt == 12) { return 1; }
        return -1;
    }

    public static String SumKeyValue (int n) {
        if (n == 1) { return "Sunday"; }
        if (n == 2) { return "Monday"; }
        if (n == 3) { return "Tuesday"; }
        if (n == 4) { return "Wednesday"; }
        if (n == 5) { return "Thursday"; }
        if (n == 6) { return "Friday"; }
        if (n == 0) { return "Saturday"; }
        return "null";
    }

    public static boolean IsLeapYear (String n) {
        int year = Integer.parseInt(n);
        if (year%4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    return true;
                }
                else return false;
            }
            else
                return true;
        }
        else
            return false;
    }

}