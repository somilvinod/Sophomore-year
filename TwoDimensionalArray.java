public class TwoDimensionalArray {

    public static void main (String [] args) {


/*      There are two ways to store rectangular arrays of data.
        One using 1 dimensional arrays and a 2nd using 2 dimensional arrays. */

 /*       2020 New York Mets Starting Pitchers
                Name, Age, Throws, Height, Weight
        1. Jacob deGrom, 31, Right, 6'4", 180
        2. Noah Syndegaard, 26, Right, 6'6", 240
        3. Steven Matz, 28, Left, 6'2", 200
        4. Marcus Stroman, 28, Right, 5'7", 180
        5. Rick Porcello, 30, Right, 6'5", 205

        One dimensional array example
  */

        String [] fname = {"Jacob", "Noah", "Steven", "Marcus", "Rick"};
        String [] lname = {"deGrom", "Syndegaard", "Matz", "Stroman", "Porcello"};
        int [] age = {31, 26, 28, 28, 30};
        String [] toss = {"Right", "Right", "Left", "Right", "Right"};
        String [] height = {"6'4\"", "6'6\"", "6'2\"", "5'7\"", "6'5\""};
        int weight [] = {180, 240, 200, 180, 205};

        System.out.printf("%-9s %-13s %-6s %-9s %-9s %-9s \n", "FName", "LName", "Age", "Throws", "Height", "Weight");
        System.out.printf("%-9s %-13s %-6s %-9s %-9s %-9s \n", "-----", "-----", "---", "------", "------", "------");

        for(int i = 0; i < fname.length; i++)
            System.out.printf("%-9s %-13s %-6s %-9s %-9s %-9s \n", fname[i], lname[i], age[i], toss[i], height[i], weight[i]);

        System.out.println(" ");
        System.out.println(" ");

        // Two dimensional array
        // 2 ways to define

        int [] [] example = new int [2] [3]; // Creates a 2 row, 3 column array with all 0's in it
        int [] [] example2 = {{1,2,3}, {4,5,6,}};  // Creates a 2 row, 3 column array with all 0's in it




        String [] [] metsData = {{"Jacob", "deGrom", "31", "Right", "6'4\"", "180"},
                                {"Noah" , "Syndegaard", "26", "Right", "6'6\"", "240"},
                                {"Steven", "Matz", "28", "Left", "6'2\"", "200"},
                                {"Marcus", "Stroman", "28", "Right", "5'7\"", "180"},
                                {"Rick", "Porcello", "30", "Right", "6'5\"", "20"}};


        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s \n", "FName", "LName", "Age", "Throws", "Height", "Weight");
        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s \n", "-----", "-----", "---", "------", "------", "------");
        for(int r = 0; r < metsData.length; r++) // how many rows
            for(int c = 0; c < metsData[0].length; c++) { // in row, how many columns
                System.out.printf("%-13s", metsData[r][c]);
                if(c == metsData.length)
                    System.out.println(" ");


            }




    }
}
