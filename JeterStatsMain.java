import jdk.jfr.Category;

import java.util.Scanner;
public class JeterStatsMain {

    private static Year1998Class Y98Object;
    private static Year1999Class Y99Object;
    private static Year2000Class Y00Object;
    private static Year2006Class Y06Object;
    private static Year2009Class Y09Object;
    private static JeterStats StatsObj;


    public static void main(String[] args) {

        String replay = "yes";
        Scanner input = new Scanner(System.in);
        System.out.println("This program will display data regarding Derek Jeter's 6 best statistical years in the MLB");
        while (replay.equals("yes")) {

            System.out.println("Enter a statistical category or year (year, GP, AB, HR, BA, SO): ");
            String category = input.next();
            if (category.equals("year")) {
                System.out.println("Which years stats would you like to see? ('98, '99, '00, '06, '09, '12): ");
                String year = input.next();

                if (year.equals("'98")) {
                    System.out.println(" 1998, Age: " + Y98Object.age() + "\n " + Y98Object.games() + " games \n " + Y98Object.PA() + " plate appearances \n " + Y98Object.AB() + " at bats \n "
                            + Y98Object.R() + " runs (LED LEAGUE)\n " + Y98Object.H() + " hits \n " + Y98Object.HR() + " home runs \n " + Y98Object.RBI() + " runs batted in \n " + Y98Object.BA() + " batting average \n "
                            + Y98Object.OBP() + " on base % \n " + Y98Object.SLG() + " slugging % \n " + Y98Object.OBP() + " on base % + slugging % \n " + Y98Object.SB() + " stolen bases \n " + Y98Object.SO()
                            + " strike outs \n " + Y98Object.awards());
                }

                if (year.equals("'99")) {
                    System.out.println(" 1998, Age: " + Y99Object.age() + "\n " + Y99Object.games() + " games \n " + Y99Object.PA() + " plate appearances (LED LEAGUE)\n " + Y99Object.AB() + " at bats \n "
                            + Y99Object.R() + " runs \n " + Y99Object.H() + " hits (LED LEAGUE)\n " + Y99Object.HR() + " home runs \n " + Y99Object.RBI() + " runs batted in \n " + Y99Object.BA() + " batting average \n "
                            + Y99Object.OBP() + " on base % \n " + Y99Object.SLG() + " slugging % \n " + Y99Object.OBP() + " on base % + slugging % \n " + Y99Object.SB() + " stolen bases \n " + Y99Object.SO()
                            + " strike outs \n " + Y99Object.awards());
                }

                if (year.equals("'00")) {
                    System.out.println(" 1998, Age: " + Y00Object.age() + "\n " + Y00Object.games() + " games \n " + Y00Object.PA() + " plate appearances \n " + Y00Object.AB() + " at bats \n "
                            + Y00Object.R() + " runs \n " + Y00Object.H() + " hits \n " + Y00Object.HR() + " home runs \n " + Y00Object.RBI() + " runs batted in \n " + Y00Object.BA() + " batting average \n "
                            + Y00Object.OBP() + " on base % \n " + Y00Object.SLG() + " slugging % \n " + Y00Object.OBP() + " on base % + slugging % \n " + Y00Object.SB() + " stolen bases \n " + Y00Object.SO()
                            + " strike outs \n " + Y00Object.awards());
                }

                if (year.equals("'06")) {
                    System.out.println(" 1998, Age: " + Y06Object.age() + "\n " + Y06Object.games() + " games \n " + Y06Object.PA() + " plate appearances \n " + Y06Object.AB() + " at bats \n "
                            + Y06Object.R() + " runs \n " + Y06Object.H() + " hits \n " + Y06Object.HR() + " home runs \n " + Y06Object.RBI() + " runs batted in \n " + Y06Object.BA() + " batting average \n "
                            + Y06Object.OBP() + " on base % \n " + Y06Object.SLG() + " slugging % \n " + Y06Object.OBP() + " on base % + slugging % \n " + Y06Object.SB() + " stolen bases \n " + Y06Object.SO()
                            + " strike outs \n " + Y06Object.awards());
                }

                if (year.equals("'09")) {
                    System.out.println(" 1998, Age: " + Y09Object.age() + "\n " + Y09Object.games() + " games \n " + Y98Object.PA() + " plate appearances \n " + Y98Object.AB() + " at bats \n "
                            + Y98Object.R() + " runs \n " + Y98Object.H() + " hits \n " + Y98Object.HR() + " home runs \n " + Y98Object.RBI() + " runs batted in \n " + Y98Object.BA() + " batting average \n "
                            + Y98Object.OBP() + " on base % \n " + Y98Object.SLG() + " slugging % \n " + Y98Object.OBP() + " on base % + slugging % \n " + Y98Object.SB() + " stolen bases \n " + Y98Object.SO()
                            + " strike outs \n " + Y98Object.awards());
                }

                if (year.equals("'12")) {
                    System.out.println(" 1998, Age: " + Y98Object.age() + "\n " + Y98Object.games() + " games \n " + Y98Object.PA() + " plate appearances (LED LEAGUE)\n " + Y98Object.AB() + " at bats (LED LEAGUE)\n "
                            + Y98Object.R() + " runs \n " + Y98Object.H() + " hits (LED LEAGUE)\n " + Y98Object.HR() + " home runs \n " + Y98Object.RBI() + " runs batted in \n " + Y98Object.BA() + " batting average \n "
                            + Y98Object.OBP() + " on base % \n " + Y98Object.SLG() + " slugging % \n " + Y98Object.OBP() + " on base % + slugging % \n " + Y98Object.SB() + " stolen bases \n " + Y98Object.SO()
                            + " strike outs \n " + Y98Object.awards());
                }
            }

            if (category.equals("GP")) {
                System.out.print(StatsObj.GP());
            }

            if (category.equals("AB")) {
                System.out.print(StatsObj.AB());
            }
            if (category.equals("HR")) {
                System.out.print(StatsObj.HR());
            }
            if (category.equals("BA")) {
                System.out.print(StatsObj.BA());
            }
            if (category.equals("SO")) {
                System.out.print(StatsObj.SO());
            }


            System.out.println("\n\nWould you like to check out more of Derek Jeter's stats?: ");
            replay = input.next();


        }

    }
}