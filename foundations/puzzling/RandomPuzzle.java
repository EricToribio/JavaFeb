import java.util.Random;
import java.util.ArrayList;
class RandomPuzzle {

    int[] getTenRolls() {
        // Random num = new Random();
        int[] rolls = new int[10];
        int i = 0;
        while(i < rolls.length) {
            rolls[i] = new Random().nextInt(21);
            i++;
            
        }
        return rolls;
    }
}