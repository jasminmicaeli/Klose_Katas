public class Validator {

    public boolean scramble(String poolOfLetters, String word){
        poolOfLetters   = poolOfLetters.toLowerCase();
        word            = word.toLowerCase();

        for(char letter : word.toCharArray()){

            if(poolOfLetters.indexOf(letter) == -1){
                return false;
            }
        }
        return true;
    }
}
