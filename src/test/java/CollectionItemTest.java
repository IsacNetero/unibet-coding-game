import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class CollectionItemTest {

    @Test
    public void should_return_merged_list_ordered_desc_no_duplicate_g5(){

        List<Integer> list1 = Arrays.asList(1,2,6,6,8,9);
        List<Integer> list2 = Arrays.asList(9,7,9,4,10,15,10);
        List<Integer> expectedResult = Arrays.asList(15,10,9,8,7,6);

        Assertions.assertThat(expectedResult).isEqualTo(new CollectionItem().mergeAndTransform(list1, list2));

    }
}