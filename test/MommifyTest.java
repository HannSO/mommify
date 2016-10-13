/**
 * Created by hannahsmyth-osbourne on 13/10/2016.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifyTest {

    private Mommify mommify;

    @Before
    public void setUp() throws Exception {
        mommify = new Mommify();
    }

    @org.junit.Test
    public void shouldNotMommifyAnEmptyString() throws Exception {
        assertEquals("", mommify.transform(""));
    }

    @Test
    public void shouldNotMommifySingleConsonant() throws Exception {
        assertEquals("s", mommify.transform("s"));
    }

    @Test
    public void shouldMommifyOnlyTheVowel() throws Exception {
        assertEquals("hmommyn", mommify.transform("hen"));

    }

    @Test
    public void shouldMommifySingleVowel() throws Exception {
        assertEquals("mommy", mommify.transform("a"));

    }

    @Test
    public void shouldNotMommifyHard() throws Exception {
        assertEquals("hard", mommify.transform("hard"));

    }

    @Test
    public void onlyReturnsOneMommyForMultipleVowels() throws Exception {
        assertEquals("hmommyr", mommify.transform("hear"));
    }

    @Test
    public void mommificationOfAeihou() throws Exception {
        assertEquals("mommyhmommy", mommify.transform("aehou"));
    }
}
