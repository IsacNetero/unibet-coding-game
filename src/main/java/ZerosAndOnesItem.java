import java.util.List;
import java.util.stream.Stream;

public class ZerosAndOnesItem implements RunnableItem {

    private List<Integer> list1;
    private List<Integer> list2;

    public ZerosAndOnesItem(){}

    public ZerosAndOnesItem(List<Integer> list1, List<Integer> list2){
        this.list1 = list1;
        this.list2 = list2;
    }

    public long countOnes(List<Integer> list1, List<Integer> list2){

        Stream<Integer> mergedStream = Stream.concat(list1.stream(), list2.stream());
        return mergedStream.filter(value-> value==1).count();
    }

    @Override
    public void run() {
        System.out.println(countOnes(list1, list2));
    }
}
