import java.util.Arrays;

public class TestRandom {
    public static void main(String[] args){
        RandomPuzzle puzzle = new RandomPuzzle();
        int[] randomDie = puzzle.getTenRolls();
        int i = 0;
        while( i < randomDie.length) {
            System.out.println(randomDie[i]);
            i++;
        }

        char letterRandom = puzzle.getRandomLetter();
        System.out.println(letterRandom);

        String randomPassword = puzzle.password();
        System.out.println(randomPassword);
        
        System.out.println("Enter a number");
        String num = System.console().readLine();
        int num2 = Integer.parseInt(num);
        System.out.println(Arrays.toString(puzzle.passwordArr(num2)));

        
        
    }
    
}