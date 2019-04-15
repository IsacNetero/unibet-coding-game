import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionItem implements RunnableItem {

    private List<Integer> list1;
    private List<Integer> list2;

    public CollectionItem(){ }

    public CollectionItem(List<Integer> list1, List<Integer> list2){
        this.list1 = list1;
        this.list2 = list2;
    }
    public List<Integer> mergeAndTransform(List<Integer> list1, List<Integer> list2){

        Stream<Integer> mergedStream = Stream.concat(list1.stream(), list2.stream());
        return mergedStream.distinct()
                .filter(value-> value > 5)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    @Override
    public void run() {
        List<Integer> mergedList = mergeAndTransform(list1, list2);
        mergedList.stream().forEach(System.out::println);
    }
}
