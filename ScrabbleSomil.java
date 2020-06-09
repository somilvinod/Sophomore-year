import java.util.Scanner; // SOMIL VINOD G BLOCK
public class ScrabbleSomil {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int wordValue = 0;

        String [] [] scrabbleValues = {{"a", "1"},
                {"b", "3"},
                {"c", "3"},
                {"d", "2"},
                {"e", "1"},
                {"f", "4"},
                {"g", "2"},
                {"h", "4"},
                {"i", "1"},
                {"j", "8"},
                {"k", "5"},
                {"l", "1"},
                {"m", "3"},
                {"n", "1"},
                {"o", "1"},
                {"p", "3"},
                {"q", "10"},
                {"r", "1"},
                {"s", "1"},
                {"t", "1"},
                {"u", "1"},
                {"v", "4"},
                {"w", "4"},
                {"x", "8"},
                {"y", "4"},
                {"z", "10"}};

        System.out.print("Enter a word: ");
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < scrabbleValues.length; j++) { // J REPRESENTS ROWS, HORIZONTAL
                if (word.substring(i, i + 1).equals(scrabbleValues[j][0] )) {
                    String valueString = scrabbleValues[j][1];
                    int valueInt = Integer.parseInt(valueString);
                    wordValue = wordValue + valueInt;
                }
            }
        }

        System.out.println("The value of the word " + word + " is " + wordValue);
    }
}
