import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ZerosAndOnesItemTest {

    @Test
    public void should_find_31_one(){

        List<Integer> list1 = Arrays.asList(0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,0,1);
        List<Integer> list2 = Arrays.asList(1,1,1,0,1,0,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1);

        Assertions.assertThat(new ZerosAndOnesItem().countOnes(list1, list2)).isEqualTo(31);
    }

}