import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerGuess integerGuess = new IntegerGuess();
        String answer = null;
        for (int i = 0; i < 32; i++) {
            if (integerGuess.right_lim == integerGuess.left_lim) {
                System.out.println("Yr num is "+ integerGuess.left_lim );
                break;
            }

            System.out.println("Is your num > than "+ integerGuess.getMiddle() +" ?(answer + or -)");
            answer = scanner.nextLine();
            integerGuess.putAnswer(answer);
            //System.out.println(answer);
        }
    }
}
