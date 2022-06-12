import java.util.Comparator;

public class OrdenarXTiempo implements Comparator<Disco> {
    @Override
    public int compare(Disco o1, Disco o2){
        return o1.getTiempo() - o2.getTiempo();
    }
}
