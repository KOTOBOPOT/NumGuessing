import org.junit.Test;

public class IntegerGuessTest {

    @Test
    public void automizedIntegerGuessTest() {

        for (int i = 0;i<Integer.MAX_VALUE;i++ ){
            SingleIntegerGuessTest(i);
            if(i%100000000 == 0){
                System.out.println("success for: "+  i);
            }

        }
    }

    public void SingleIntegerGuessTest( int what_to_guess) {
        //int what_to_guess = 10;
        String last_answer = null;
        boolean isNumFound = false;
        IntegerGuess integerGuess = new IntegerGuess();
        for(int i =0; i<32;i++) {
            if ((integerGuess.left_lim == integerGuess.right_lim)&(integerGuess.left_lim == what_to_guess)){// == what_to_guess){
                isNumFound = true;
                break;
            }
            if (integerGuess.getMiddle() < what_to_guess) {
                integerGuess.putAnswer("+");
                last_answer = "+";
            } else {
                integerGuess.putAnswer("-");
                last_answer = "-";
            }
        }
    if(!isNumFound){
        System.out.println("ERROR ERROR ERROR ERROR ERROR: "+what_to_guess);
        System.exit(0);};
    }


}