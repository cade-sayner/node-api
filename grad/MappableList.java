import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MappableList<T> {
    List<T> arr;

    public MappableList(List<T> arr){
        this.arr = arr;
    }

    public <U> List<U> map(Function<T, U> func){
        List lst = new ArrayList<U>();
        for(T item : arr){
            lst.add(func.apply(item));
        }
        return lst;
    }
    public static void main(String[] args) {
        var lst = new MappableList<>(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        lst.map((item)->(item + 1));
        var thing = lst.map((item)->(new ArrayList<>(item)));
        System.out.println(lst.map((item)->(new ArrayList<>(item))));
    }
}
