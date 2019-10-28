package ProvaKata10;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test(){
        assertEquals(App.hist("uuxzzzwwwwwwwwzz"),"u 2     **\n" +
                "w 8     ********\n" +
                "x 1     *\n" +
                "z 5     *****\n");
    }

   @Test
    public void Test1(){
        assertEquals(App.hist("uuaaaxbbbbyyhwawiwjjjwwxym"),"u 2     **\n" +
                "w 5     *****\n" +
                "x 2     **\n");
    }

    @Test
    public void Test2(){
       assertEquals(App.hist("uuaaaxbbbbyyhwawiwjjjwwxymzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"),"u 2     **\n" +
               "w 5     *****\n" +
               "x 2     **\n" +
               "z 31     *******************************\n");
    }

}
