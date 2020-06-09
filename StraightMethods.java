public class StraightMethods {

    public static void main (String [] args) {

       String phrase = "TodayIsWednesday";
        int phraseLength = phrase.length();
        System.out.println(phraseLength);
        char letter = phrase.charAt(12);
        System.out.println(letter);
        String sub = phrase.substring(6);
        System.out.println(sub);
        String sub2 = phrase.substring(5,7);
        System.out.println(sub2);
        String sub3 = phrase.substring(0,1);
        System.out.println(sub3);

     //   for(int i = 0; i < phrase.length(); i++ )
       //     System.out.println(phrase.substring(i, i+1));

        String phrase2 = "ItsHumpDay";
        System.out.println(phrase + phrase2);
        String phrase3 = phrase.concat(phrase2);
        System.out.println(phrase3);
        String phrase4 = phrase + phrase2;
        System.out.println(phrase4);

     /*   if(phrase4.substring(0,1).equalsIgnoreCase("i"))
            System.out.println(phrase4.substring(0,1));
        if(phrase4.substring(1,2).compareTo("t") == 0)
                System.out.println(phrase4.substring(1,2));
        String phrase5 = "mississippi";
        int k = phrase5.indexOf("i");
        System.out.println(k);
        int w = phrase5.lastIndexOf("i");
        System.out.println(w);
        int z = phrase5.indexOf("i", 5);
        System.out.println(z);
        for(int r = 0; r < phrase5.length(); r++)
            System.out.println(phrase5.indexOf("i",r));

        String phrase6 = phrase5.replace("i","w");
        System.out.println(phrase6); */




    }





}



