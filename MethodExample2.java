import java.util.Scanner;
public class MethodExample2 {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select a teacher (Bach, Daniel, or Derby): ");
        String name = input.next();
        System.out.println(" ");
        System.out.printf("%-15s%-11s%-9s%-20s\n", "Teacher Name", "Building", "Room #", "Course Name");
        System.out.printf("%-15s%-11s%-9s%-20s\n", "------------", "--------", "------", "-----------");
        System.out.printf("%-15s%-11s%-9s%-20s\n", name, building(name), room(building(name)), course(room(building(name))));

    }

        public static String building (String teacher) {

            if (teacher.equals("Bach"))
                return "Purdy";
            else if (teacher.equals("Daniel"))
                return "Hance";
            else
                return "Pell";
        }

        public static int room (String home) {
            if (home.equals("Purdy"))
                return 107;
            else if (home.equals("Hance"))
                return 204;
            else
                return 102;
        }

        public static String course (int classroom){
            if (classroom == 107)
                return "BC Calc";
            else if (classroom == 204)
                return "IB History";
            else
                return "English 10";
        }


}

