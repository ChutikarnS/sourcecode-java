import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void PrimeFactor2() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(2);
       assertEquals("2", result);
    }
    
    @Test
    public void PrimeFactor3() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(3);
       assertEquals("3", result);
    }
    
    @Test
    public void PrimeFactor4() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(4);
       assertEquals("22", result);
    }
    
    @Test
    public void PrimeFactor6() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(6);
       assertEquals("23", result);
    }
    
    @Test
    public void PrimeFactor8() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(8);
       assertEquals("222", result);
    }
    
    @Test
    public void PrimeFactor10() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(10);
       assertEquals("25", result);
    }
    
    @Test
    public void PrimeFactor12() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(12);
       assertEquals("223", result);
    }

}
