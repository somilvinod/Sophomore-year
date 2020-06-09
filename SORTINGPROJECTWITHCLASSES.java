import java.util.Scanner;

public class SORTINGPROJECTWITHCLASSES {


        public static void main (String [] args) {
            //obj creations

            PrintMethod printMethodObj = new PrintMethod();
            Binary2D binary2DObj = new Binary2D();
            Linear2D linear2DObj = new Linear2D();
            Bubble2D bubble2DObj = new Bubble2D();
            Quick2D quick2DObj = new Quick2D();
            Selection2D selection2DObj = new Selection2D();
            Merge2D merge2DObj = new Merge2D();
            Insertion2D insertion2DObj = new Insertion2D();


            while (true) {


                Scanner input = new Scanner(System.in);
                int x = 0;

                System.out.println("This program will search for or sort 2020 NBA data.\nPlayers included are 2020 NBA all stars: Anthony Davis, Joel Embiid, Kawhi Leonard, Pascal Siakam, Luka Doncic, Kemba Walker, James Harden, Trae Young, Khris Middleton,\nDamian Lillard, Bam Adebayo, Ben Simmons, Rudy Gobert, Nikola Jokic, Jimmy Butler, Jayson Tatum, Kyle Lowry, Chris Paul, Brandon Ingram, Russell Westbrook, Donovan Mitchell,\nDomantas Sabonis");
                System.out.println("\nYou can sort by first name, last name, number, age, or points per game.\nYou can search by the last name only");
                System.out.println("\nDo you want to (search or sort) for NBA data?: ");

                String searchOrSort = input.next();

                String[][] nbaData = {{"Anthony", "Davis", "3", "26", "24.0"}, {"Joel", "Embiid", "21", "25", "24.0"}, {"Kawhi", "Leonard", "2", "28", "18.5"}, {"Joel", "Embiid", "21", "25", "24.0"}, {"Pascal", "Siakam", "43", "25", "12.5"}, {"Luka", "Doncic", "77", "21", "24.3"}, {"Kemba", "Walker", "8", "29", "20.0"}, {"James", "Harden", "13", "30", "25.1"},
                        {"Trae", "Young", "11", "21", "23.5"}, {"Khris", "Middleton", "22", "28", "16.2"}, {"Damian", "Lillard", "0", "29", "24.1"}, {"Bam", "Adebayo", "13", "22", "10.3"}, {"Ben", "Simmons", "25", "23", "16.4"}, {"Rudy", "Gobert", "27", "27", "11.7"}, {"Nikola", "Jokic", "15", "25", "17.0"}, {"Jimmy", "Butler", "22", "30", "17.0"},
                        {"Jayson", "Tatum", "0", "22", "17.0"}, {"Kyle", "Lowry", "7", "33", "14.7"}, {"Chris", "Paul", "3", "34", "18.5"}, {"Brandon", "Ingram", "14", "22", "16.2"}, {"Russell", "Westbrook", "0", "31", "23.2"}, {"Donnovan", "Mitchell", "45", "23", "22.8"}, {"Domantas", "Sabonis", "11", "23", "12.0"}};

                printMethodObj.printMethod(nbaData);


                if (searchOrSort.equals("sort")) {
                    System.out.println("\nWhat sorting technique would you like to use? (bubble, insertion, selection, quick, or merge): ");
                    String sortTechnique = input.next();
                    System.out.println("How do you want to sort the data? (firstName, lastName, number, age, ppg): ");
                    String whichSort = input.next();

                    if (whichSort.equals("firstName"))
                        x = 0;
                    if (whichSort.equals("lastName"))
                        x = 1;
                    if (whichSort.equals("number"))
                        x = 2;
                    if (whichSort.equals("age"))
                        x = 3;
                    if (whichSort.equals("ppg"))
                        x = 4;

                    int y = 50;
                    int z = 50;
                    int z1 = 50;
                    int z2 = 50;
                    for (int i = 0; i < 5; i++) {
                        if (i != x) {
                            if (y == 50)
                                y = i;
                            else if (z == 50)
                                z = i;
                            else if (z1 == 50)
                                z1 = i;
                            else
                                z2 = i;
                        }
                    }

                    if (sortTechnique.equals("selection")) {
                        selection2DObj.selection2DMethod(nbaData, x);
                    }
                    if (sortTechnique.equals("insertion")) {
                        insertion2DObj.insertion2DMethod(nbaData, x, y, z, z1, z2);
                    }
                    if (sortTechnique.equals("bubble")) {
                        bubble2DObj.bubble2DMethod(nbaData, x);
                    }
                    if (sortTechnique.equals("merge")) {
                        merge2DObj.merge2DMethod(nbaData, x, y, z, z1, z2);
                    }
                    if (sortTechnique.equals("quick")) {
                        quick2DObj.quick2DMethod(nbaData, x, y, z, z1, z2, 0, nbaData.length - 1);
                    }
                    printMethodObj.printMethod(nbaData);
                } else {
                    System.out.print("\nWhich first name would you like to search for?: ");
                    String playerName = input.next();
                    System.out.print("Which searching technique would you like to use? (linear or binary): ");
                    String searchType = input.next();

                    int s = 0;
                    if (searchType.equals("linear"))
                        s = linear2DObj.linear2DMethod(nbaData, 0, nbaData.length, playerName);

                    if (searchType.equals("binary")) {
                        bubble2DObj.bubble2DMethod(nbaData, 0);
                        s = binary2DObj.binary2DMethod(nbaData, 0, nbaData.length, playerName);
                    }
                    if (s != -1) {
                        System.out.printf("\n%-15s%-15s%-15s%-15s%-15s\n", "First Name", "Last Name", "Number", "Age", "PPG");
                        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "----------", "---------", "------", "---", "---");
                        for (int h = 0; h < 5; h++) {
                            System.out.printf("%-15s", nbaData[s][h]);
                        }
                    } else
                        System.out.println("Name is not in the list.");

                }

                System.out.println("\nWould you like to sort or search more NBA data (y/n)?: ");
                String response = input.next();
                if (response.equals("n") || response.equals("N"))
                    System.exit(0);
            }
        }
    }









