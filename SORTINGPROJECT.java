import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;



public class SORTINGPROJECT {

        public static void main (String [] args) {
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

            printMethod(nbaData);


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
                    selection2DMethod(nbaData, x);
                }
                if (sortTechnique.equals("insertion")) {
                    insertion2DMethod(nbaData, x, y, z, z1, z2);
                }
                if (sortTechnique.equals("bubble")) {
                    bubble2DMethod(nbaData, x);
                }
                if (sortTechnique.equals("merge")) {
                    merge2DMethod(nbaData, x, y, z, z1, z2);
                }
                if (sortTechnique.equals("quick")) {
                    quick2DMethod(nbaData, x, y, z, z1, z2, 0, nbaData.length - 1);
                }
                printMethod(nbaData);
            } else {
                System.out.print("\nWhich first name would you like to search for?: ");
                String playerName = input.next();
                System.out.print("Which searching technique would you like to use? (linear or binary): ");
                String searchType = input.next();

                int s = 0;
                if (searchType.equals("linear"))
                    s = linear2DMethod(nbaData, 0, nbaData.length, playerName);

                if (searchType.equals("binary")) {
                    bubble2DMethod(nbaData, 0);
                    s = binary2DMethod(nbaData, 0, nbaData.length, playerName);
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

        public static void printMethod (String[][]a){
            System.out.printf("\n%-15s%-15s%-15s%-15s%-15s\n", "First Name", "Last Name", "Number", "Age", "PPG");
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "----------", "---------", "------", "---", "---");

            for (int r = 0; r < a.length; r++) {
                for (int c = 0; c < a[0].length; c++) {
                    if (c != a[0].length - 1)
                        System.out.printf("%-15s", a[r][c] + " ");
                    else {
                        System.out.printf("%-15s", a[r][c] + " ");
                        System.out.println(" ");
                    }
                }
            }
        }


        public static void swap (String[][]a,int r, int w, int z){
            String temp = a[w][z];
            a[w][z] = a[r][z];
            a[r][z] = temp;
        }


        public static void selection2DMethod (String[][]a,int x){
            for (int r = 0; r < a.length - 1; r++) {
                int smallestIndex = r;
                for (int c = r + 1; c <= a.length - 1; c++) {
                    if (a[smallestIndex][x].compareTo(a[c][x]) > 0) {
                        smallestIndex = c;
                    }
                }
                swap(a, smallestIndex, r, 0);
                swap(a, smallestIndex, r, 1);
                swap(a, smallestIndex, r, 2);
                swap(a, smallestIndex, r, 3);
                swap(a, smallestIndex, r, 4);

            }
        }

        public static void insertion2DMethod (String a [][],int x, int y, int z, int z1, int z2){
            for (int r = 1; r < a.length; r++) {
                String temp = a[r][x];
                String temp2 = a[r][y];
                String temp3 = a[r][z];
                String temp4 = a[r][z1];
                String temp5 = a[r][z2];

                int pos = r - 1;

                while ((pos >= 0) && (temp.compareTo(a[pos][x]) < 0)) {
                    a[pos + 1][x] = a[pos][x];
                    a[pos + 1][y] = a[pos][y];
                    a[pos + 1][z] = a[pos][z];
                    a[pos + 1][z1] = a[pos][z1];
                    a[pos + 1][z2] = a[pos][z2];
                    pos--;
                    a[pos + 1][x] = temp;
                    a[pos + 1][y] = temp2;
                    a[pos + 1][z] = temp3;
                    a[pos + 1][z1] = temp4;
                    a[pos + 1][z2] = temp5;
                }
            }
        }

        public static void bubble2DMethod (String[][]a,int x){
            for (int c = 0; c < a.length - 1; c++) {
                for (int r = 0; r < (a.length - 1 - c); r++) {
                    if (a[r][x].compareTo(a[r + 1][x]) > 0) {
                        swap(a, r, r + 1, 0);
                        swap(a, r, r + 1, 1);
                        swap(a, r, r + 1, 2);
                        swap(a, r, r + 1, 3);
                        swap(a, r, r + 1, 4);
                    }
                }
            }
        }

        public static void merge2DMethod (String[][]array,int x, int y, int z, int z1,
                                          int z2) // only works for 3 columns
        {

            if (array.length > 1) {
                int elementsInA1 = array.length / 2;
                int elementsInA2 = elementsInA1;
                if ((array.length % 2) == 1)
                    elementsInA2 += 1;
                String arr1[][] = new String[elementsInA1][array[0].length];
                String arr2[][] = new String[elementsInA2][array[0].length];
                for (int i = 0; i < elementsInA1; i++)
                    move(arr1, array, i, i, x, y, z, z1, z2);
                for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                    move(arr2, array, i - elementsInA1, i, x, y, z, z1, z2);
                merge2DMethod(arr1, x, y, z, z1, z2);
                merge2DMethod(arr2, x, y, z, z1, z2);

                int i = 0, j = 0, k = 0;
                while (arr1.length != j && arr2.length != k) {
                    if (arr1[j][x].compareTo(arr2[k][x]) < 0) {
                        move(array, arr1, i, j, x, y, z, z1, z2);
                        i++;
                        j++;
                    } else {
                        move(array, arr2, i, k, x, y, z, z1, z2);
                        i++;
                        k++;
                    }
                }
                while (arr1.length != j) {
                    move(array, arr1, i, j, x, y, z, z1, z2);
                    i++;
                    j++;
                }
                while (arr2.length != k) {
                    move(array, arr2, i, k, x, y, z, z1, z2);
                    i++;
                    k++;
                }
            }
        }

        public static void move (String[][]a, String [][]b,int i, int j, int x, int y, int z, int z1, int z2)
        {
            a[i][x] = b[j][x];
            a[i][y] = b[j][y];
            a[i][z] = b[j][z];
            a[i][z1] = b[j][z1];
            a[i][z2] = b[j][z2];
        }

        public static void quick2DMethod (String[][]a,int x, int y, int z, int z1, int z2, int from, int to){

            if (from >= to)
                return;
            int p = (from + to) / 2;
            int i = from;
            int j = to;
            while (i <= j) {
                if (a[i][x].compareTo(a[p][x]) <= 0)
                    i++;
                else if (a[j][x].compareTo(a[p][x]) >= 0)
                    j--;
                else {
                    swap(a, j, i, x);
                    swap(a, j, i, y);
                    swap(a, j, i, z);
                    swap(a, j, i, z1);
                    swap(a, j, i, z2);
                    i++;
                    j--;
                }
            }
            if (p < j) {
                swap(a, j, p, x);
                swap(a, j, p, y);
                swap(a, j, p, z);
                swap(a, j, p, z1);
                swap(a, j, p, z2);
                p = j;
            } else if (p > i) {
                swap(a, i, p, x);
                swap(a, i, p, y);
                swap(a, i, p, z);
                swap(a, i, p, z1);
                swap(a, i, p, z2);

                p = i;
            }
            quick2DMethod(a, x, y, z, z1, z2, from, p - 1);
            quick2DMethod(a, x, y, z, z1, z2, p + 1, to);
        }

        public static int linear2DMethod (String[][]a,int first, int last, String key)
        {
            String test = "false";
            for (int i = 0; i < a.length; i++) {
                if (key.equals(a[i][0]))
                    return i;
            }
            return -1;
        }

        public static int binary2DMethod (String[][]a,int first, int last, String key)
        {
            while (first < last) {
                int mid = (first + last) / 2;
                if (key.compareTo(a[mid][0]) < 0)
                    last = mid;
                else if (key.compareTo(a[mid][0]) > 0)
                    first = mid + 1;
                else
                    return mid;
            }
            return -1;
        }
    }







