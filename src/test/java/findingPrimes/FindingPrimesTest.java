package findingPrimes;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindingPrimesTest {

    @Test
    public void czyPierwszaTest(){

        //given
        int first = 7;

        //when
        boolean result = FindingPrimes.czyPierwsza(first);

        //then
        assertTrue(result);
    }
    @Test
    public void czyNiePierwszaTest(){

        //given
        int first = 8;

        //when
        boolean result = FindingPrimes.czyPierwsza(first);

        //then
        assertFalse(result);
    }


}