package test;

import model.Analizer;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class Analizer_ {

    Analizer analizer;
    int quantity;
    int sum;

    @Before
    public void init(){
        analizer = new Analizer();
    }

    @Test
    public void should_return_other_quantity() {
        quantity = analizer.analyze(1000, 2000, 3)[0];
        assertTrue(11==quantity);
        quantity = analizer.analyze(1000, 2000, 4)[0];
        assertTrue(21==quantity);
        quantity = analizer.analyze(1000, 2000, 7)[0];
        assertTrue(85==quantity);
    }
    @Test
    public void should_return_other_sum() {
        sum = analizer.analyze(1000, 2000, 3)[1];
        assertTrue(12555==sum);
        sum = analizer.analyze(1000, 2000, 4)[1];
        assertTrue(23665==sum);
        sum = analizer.analyze(1000, 2000, 7)[1];
        assertTrue(99986==sum);
    }



}
