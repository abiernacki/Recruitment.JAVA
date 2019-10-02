package digitSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSumTest {

    @Test

    public void getIndexTest(){

        //given
        int N = 3;
        String[] helpTab = {"2","4","3"};

        //when
        int index = DigitSum.getIndex(N,helpTab);

        //then
        assertEquals(1,index);
    }

}