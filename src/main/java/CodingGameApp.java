import java.util.Arrays;
import java.util.List;

public class CodingGameApp {

    public static void main(String[] args) {

        //Item1
        RunnableItem StwItem = new StwAndoItem();
        StwItem.run();

        //Item2
        List<Integer> list1 = Arrays.asList(1, 2, 6, 6, 8, 9);
        List<Integer> list2 = Arrays.asList(9, 7, 9, 4, 10, 15, 10);

        RunnableItem collectionItem = new CollectionItem(list1, list2);
        collectionItem.run();

        list1 = Arrays.asList(0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,0,1);
        list2 = Arrays.asList(1,1,1,0,1,0,0,0,1,1,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1);

        RunnableItem zerosAndOnesItem = new ZerosAndOnesItem(list1, list2);
        zerosAndOnesItem.run();
    }
}
