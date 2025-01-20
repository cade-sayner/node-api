package grad;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Main mainObj = new Main();
        mainObj.mods_n_sum_range(0, 10, 3);
        System.out.println(mainObj.mods_n_sum_range(10, 20, 3));

        String s = "hello";
        Object o = s;
        Integer n = (Integer)o;
    }

    public ArrayList<Integer> mods_n_sum_range(int a, int b, int n){
        return (new FoldableList<>(create_range(a, b))).fold(
           (prev, cur)->{
            prev.set(cur%n, prev.get(cur%n) + cur);
            return prev;
        }, create_n_zeroes(n));
    }

    public ArrayList<Integer> create_range(int a, int b){
        return IntStream.rangeClosed(a, b) 
                     .boxed()           
                     .collect(Collectors.toCollection(ArrayList::new)); 
    }

    public ArrayList<Integer> create_n_zeroes(int n){
        return IntStream.rangeClosed(0, n-1).map((i)->0).boxed().collect(Collectors.toCollection(ArrayList::new));
    }
}


