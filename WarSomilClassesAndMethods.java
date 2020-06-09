import java.util.ArrayList;
import java.util.Random;

public class WarSomilClassesAndMethods {


    public static int r;

    public static void main(String[] args) {

        // Obj and ArrayList creations

        AddRemove addRemoveObj = new AddRemove();
        AddRemoveWar addRemoveWarObj = new AddRemoveWar();
        ShuffleAndDistribute shuffleAndDistributeObj = new ShuffleAndDistribute();
        WarMain warMainObj = new WarMain();
        EndGame endGameObj = new EndGame();

        ArrayList<Integer> deck = new ArrayList<Integer>();
        ArrayList<Integer> player1Deck = new ArrayList<Integer>();
        ArrayList<Integer> player2Deck = new ArrayList<Integer>();
        ArrayList<Integer> warChest = new ArrayList<Integer>();



        shuffleAndDistributeObj.shuffleAndDistribute(player1Deck, player2Deck, deck);


        warMainObj.WarMain(player1Deck, player2Deck, warChest);

        endGameObj.EndGame(player1Deck, player2Deck, r);


    }
}






