package SetCover;

import java.util.Set;

public class Vortex {
    private Set<Integer> haveSet;

    public Vortex(Set<Integer> haveSet) {
        this.haveSet = haveSet;
    }

    public int getHaveVortexSize() {
        return haveSet.size();
    }

    public void removeDuplicateVortex(int[] set) {
        for (int num : set) {
            haveSet.remove(num);
        }
    }
}
