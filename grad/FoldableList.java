package grad;

import java.util.ArrayList;
import java.util.function.BiFunction;
   public class FoldableList<T>{
        ArrayList<T> arr;

        public FoldableList(ArrayList<T> arr){
            this.arr = arr;
        }
        
        // G represents the type of the accumulator
        // T represents the type of the foldable list

        public <G> G fold(BiFunction<G, T, G> predicate, G initialAccumulator){
            G accumulator = initialAccumulator;
            for(T val : this.arr){
                accumulator = predicate.apply(accumulator, val);
            }
            return accumulator;
        }
    } 

