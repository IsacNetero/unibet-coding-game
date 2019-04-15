import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StwAndoItem implements RunnableItem {

    private static final String STW_LABEL = "Stw";
    private static final String ANDO_LABEL = "Ando";
    private static final  int STW_TRIGGER = 3;
    private static final  int ANDO_TRIGGER = 5;
    private static final  int MIN_RANGE = 0;
    private static final  int MAX_RANGE = 100;

    public List<String> transformToStwAndo(int min, int max){

       return IntStream.range(min, max + 1).boxed().map(value ->{

            boolean isStw = value %STW_TRIGGER ==0 ;
            boolean isAndo =  value%ANDO_TRIGGER==0;
            String transformedValue = "";

            if(isStw && isAndo){
                transformedValue = STW_LABEL+ANDO_LABEL;
            }else if(isStw){
                transformedValue = STW_LABEL;
            }else if(isAndo){
                transformedValue = ANDO_LABEL;
            }else {
                transformedValue = String.valueOf(value);
            }
            return transformedValue;

        }).collect(Collectors.toList());
    }

    @Override
    public void run() {

        List<String> transformedValues =  transformToStwAndo(MIN_RANGE, MAX_RANGE);
        transformedValues.stream().forEach(System.out::println);
    }
}
