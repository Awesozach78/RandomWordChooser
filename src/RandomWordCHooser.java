/**
 * Created by 20171340 on 1/19/2017.
 */
public class RandomWordCHooser {
    String[] theWords;
    int[] alreadyPicked;
    int numberOfWordsPicked;

    public RandomWordCHooser(String[] in) {
        theWords = in;
        alreadyPicked = new int[theWords.length];
        numberOfWordsPicked = 0;
    }

    public String getNext() {
        boolean keepTrying = false;
        int n;
        if( numberOfWordsPicked == theWords.length){
            return "None";
        }
        do {
            keepTrying = false;
            n = (int) (Math.random() * theWords.length);
            for (int i = 0; i < alreadyPicked.length; i++) {
                if (alreadyPicked[i] == n) {
                    keepTrying = true;


                }
            }
        } while (keepTrying);

        alreadyPicked[numberOfWordsPicked] = n;
        numberOfWordsPicked +=1;
        return theWords[n];
    }
}

//////Screwed!