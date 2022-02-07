import java.util.Random;
class RandomPuzzle {

    int[] getTenRolls() {
        // Random num = new Random();
        int[] rolls = new int[10];
        int i = 0;
        while(i < rolls.length) {
            rolls[i] = new Random().nextInt(21)+1;
            i++;
        }
        return rolls;
    }
    char getRandomLetter() {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
    'o','p','q','r','s','t','u','v','w','x','y','z'};
    Random num = new Random();
    return alphabet[num.nextInt(alphabet.length)];
    }

    String password() {
        String password = new String();
            for(int i = 0 ;password.length() <= 8 ; i++){
                Random num = new Random();
                int[] randomDie = getTenRolls();
                if( num.nextInt(2) % 2 == 0 ) {
                    password += getRandomLetter();
                }else {
                    password += String.valueOf(randomDie[num.nextInt(randomDie.length)]);
                }
        }
    return password;   
    }
    String[] passwordArr(int arrLength) {
        String[] arrPasswords = new String[arrLength];
        for(int i = 0; i < arrPasswords.length ; i++){
            arrPasswords[i] = password();
        }
        return arrPasswords;
    }
    
}