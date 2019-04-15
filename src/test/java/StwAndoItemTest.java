import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class StwAndoItemTest {

    @Test
    public void should_transform_values_between_1_and_10(){

        List<String> expectedValues = Arrays.asList("1", "2", "Stw", "4", "Ando", "Stw", "7", "8", "Stw", "Ando");
        List<String> actualValues = new StwAndoItem().transformToStwAndo(1,10);
        Assertions.assertThat(actualValues).isEqualTo(expectedValues);
    }
    @Test
    public void should_transform_values_between_1_and_15(){

        List<String> expectedValues = Arrays.asList("1", "2", "Stw", "4", "Ando", "Stw", "7", "8", "Stw", "Ando",
                "11", "Stw", "13", "14", "StwAndo");
        List<String> actualValues = new StwAndoItem().transformToStwAndo(1,15);
        Assertions.assertThat(actualValues).isEqualTo(expectedValues);
    }
}
