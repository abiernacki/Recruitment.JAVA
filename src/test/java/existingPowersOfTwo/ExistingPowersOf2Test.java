package existingPowersOfTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExistingPowersOf2Test {

    @Test
    public void testTrim(){

        String result = ExistingPowersOf2.trimStringByString("001000000000","0");

        assertEquals("1",result);
    }

    @Test
    public void testTrim1(){

        String result = ExistingPowersOf2.trimStringByString("0010011000000","0");

        assertEquals("10011",result);
    }

    @Test
    public void testTrim3(){
        String text = Integer.toBinaryString(4096);
        assertEquals("1000000000000", text);

        String result = ExistingPowersOf2.trimStringByString(text,"0");

        assertEquals("1",result);
    }

    @Test
    public void testTrim4(){
        String text = Integer.toBinaryString(1048576);
        assertEquals("100000000000000000000", text);

        String result = ExistingPowersOf2.trimStringByString(text,"0");

        assertEquals("1",result);
    }
}