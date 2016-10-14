import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannahsmyth-osbourne on 13/10/2016.
 */
public class Mommify {

    private final String MOMMY = "mommy";


    public String transform(String input) {
       if (VowelsAreOverThirtyPercent(input)){
           for(char c : input.toCharArray()) {
               {
                   input = input.replace(""+c, MOMMY);
               }
           }
       }
       return input;
    }


    private boolean isAVowel(char letter) {
        return ("aieou".contains(String.valueOf(letter)));
    }

    private boolean VowelsAreOverThirtyPercent(String input) {
        List<String> allVowels = new ArrayList();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (isAVowel(character)) {
                allVowels.add(String.valueOf(character));
            }
        }
        return (allVowels.size() >= 0.3 * input.length());
    }
}
