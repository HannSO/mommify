import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannahsmyth-osbourne on 13/10/2016.
 */
public class Mommify {

    private final String MOMMY = "mommy";
    private String transformedString = new String();

    public String transform(String input) {
       if (VowelsAreOverThirtyPercent(input)){
           for(char c : input.toCharArray()) {
               if (!isAVowel(c)){transformedString = transformedString.concat(String.valueOf(c));}
               System.out.print(transformedString.endsWith(MOMMY));
               if  (!(transformedString.endsWith(MOMMY))&& isAVowel(c)) {
                   transformedString = transformedString.concat(MOMMY);
               }
           }
           return transformedString;
       }
       return input;
    }

    private boolean isAVowel(char c) {
        return ("aieou".contains(String.valueOf(c)));
    }

    private boolean VowelsAreOverThirtyPercent(String input) {
        List<Character> allVowels = new ArrayList();
        for(char c : input.toCharArray()) {
            if (isAVowel(c)) {allVowels.add(c);}
        }
        return (allVowels.size() >= 0.3 * input.length());
    }
}
