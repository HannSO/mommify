import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannahsmyth-osbourne on 13/10/2016.
 */
public class Mommify {

    private final String MOMMY = "mommy";


    public String transform(String input) {
        Boolean consecutive = false;
        StringBuffer inputAsBuffer = new StringBuffer(input);
        if (areVowelsOverThirtyPercent(input)) {
            for (int i = 0; i < inputAsBuffer.length(); i++) {
                char character = inputAsBuffer.charAt(i);
                if (isAVowel(character)) {
                    inputAsBuffer.deleteCharAt(i);
                    if(!consecutive) {
                        inputAsBuffer.insert(i, MOMMY);
                        i = i + MOMMY.length() - 1;
                        consecutive = true;
                        continue;
                    }
                } else {
                    consecutive = false;
                }
            }
        }
        return inputAsBuffer.toString();
    }

    private boolean isAVowel(char letter) {
        return ("aieou".contains(String.valueOf(letter)));
    }

    private boolean areVowelsOverThirtyPercent(String input) {
//        StringBuffer inputAsBuffer= new StringBuffer(input);
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
