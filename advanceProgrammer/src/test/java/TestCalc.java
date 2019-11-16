import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int actual = calc.add(1, 2);
        Assert.assertEquals(3, actual);
    }
}
