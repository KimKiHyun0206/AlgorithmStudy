package SetCover;

import java.util.LinkedList;
import java.util.List;

public class VortexLoader {
    private List<Vortex> vortexes = new LinkedList<>();

    public void addVortex(Vortex vortex){
        vortexes.add(vortex);
    }

    public Vortex getBiggestVortex(){
        int biggest = 0;
        for(int i=0;i< vortexes.size();i++){
            if(vortexes.get(i).getHaveVortexSize()>=biggest){
                biggest=i;
            }
        }
        Vortex returnVortex = vortexes.get(biggest);
        vortexes.remove(biggest);
        return returnVortex;
    }
}
