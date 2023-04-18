package SetCover;

import java.util.HashSet;
import java.util.Set;

public class DefaultSet {
    private Set<Integer> set = new HashSet<>();

    public DefaultSet(int[] numbers) {
        for (int num : numbers) {
            set.add(num);
        }
    }
    public void deleteSet(int[] set){
        for(int num : set){
            this.set.remove(num);
        }
    }
}
