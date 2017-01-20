/**
 * Created by 20171340 on 1/20/2017.
 */
class Main {
    public static void main(String[] args) {
        RandomWordCHooser chooser =
                new RandomWordCHooser(new String[]{"wheels", "on", "the", "bus"});

        for (int k = 0; k < 6; k++) {
            System.out.print(chooser.getNext() + " ");
        }
    }
}