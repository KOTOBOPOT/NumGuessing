public class IntegerGuess {
    private String last_answer;

    public int right_lim = Integer.MAX_VALUE;;
    public int left_lim = 0;//Integer.MIN_VALUE;;
    private int middle = (right_lim/2)+(left_lim/2 );

    IntegerGuess(){

    }
    private void analyse_answer(String answer){

        if(answer.equals("+")){
            this.left_lim = middle+1;
           }
        if(answer.equals("-")) {
            this.right_lim = middle;//-1
        }
        this.middle = ((right_lim/2)+(left_lim/2) );
    }
    public int putAnswer(String answer){
        this.last_answer = answer;
        analyse_answer(answer);
        return getMiddle();
    }
    public int getMiddle(){
        return this.middle;
    }
}
