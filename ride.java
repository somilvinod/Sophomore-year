/*
ID: somil.v1
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

class ride {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        StringTokenizer st1 = new StringTokenizer(f.readLine());
        StringTokenizer st2 = new StringTokenizer(f.readLine());

        String comet = st1.nextToken();
        String group = st2.nextToken();

        int cometMultiply = 1;
        int groupMultiply = 1;

        for (int i = 0; i < comet.length(); i++) {

            cometMultiply *= comet.charAt(i) + 1 - 65;
            cometMultiply %= 47;

        }

        for (int j = 0; j < group.length(); j++) {

            groupMultiply *= group.charAt(j) + 1 - 65;
            groupMultiply %= 47;

        }

        if (cometMultiply == groupMultiply) {
            out.println("GO");
            out.close();

        } else {

            out.println("STAY");
            out.close();

        }
    }

}

