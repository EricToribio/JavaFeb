

public class TestRandom {
    public static void main(String[] args){
        RandomPuzzle puzzle = new RandomPuzzle();
        int[] randomDie = puzzle.getTenRolls();
        int i = 0;
        while( i < randomDie.length) {
            System.out.println(randomDie[i]);
            i++;
        }
    }
}