public class PrintMethod {
    public void printMethod (String[][]a){
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
}
