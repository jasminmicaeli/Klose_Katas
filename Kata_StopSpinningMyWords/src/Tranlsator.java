import java.util.ArrayList;
import java.util.List;

public class Tranlsator {

    public String validateString(String sentence){

        List<String> correctedWords = new ArrayList<>();

        for(String word : sentence.split(" ")){

            if(needsToBeSpinned(word)){
                correctedWords.add(spinThisWord(word));
            }
            else correctedWords.add(word);
        }

        return String.join(" ", correctedWords);
    }

    public boolean needsToBeSpinned(String word){
        return word.length() >= 5;
    }

    String spinThisWord(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
