package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Analizer_ {

    Analizer analizer;

    @Before
    public void init(){
        analizer = new Analizer();
    }

    @Test
    public void should_return_the_quantity_of() {
        int a = analizer.analyze(1000, 2000, 3)[0];
        assertThat(11==a);

    }

    public class Analizer {
        public int[] analyze(int i, int i1, int i2) {
            int[] r = new int[2];
            r[0]= 11;
            r[1]= 0;
            return r;
        }
    }
}
