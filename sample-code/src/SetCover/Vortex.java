package SetCover;

import java.util.Set;

public class Vortex {
    private final Set<Integer> haveSet;

    public Vortex(Set<Integer> haveSet) {
        this.haveSet = haveSet;
    }

    public int getHaveVortexSize() {
        return haveSet.size();
    }
}
