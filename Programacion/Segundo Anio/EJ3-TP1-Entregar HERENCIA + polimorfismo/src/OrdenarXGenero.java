import java.util.Comparator;

public class OrdenarXGenero implements Comparator<Disco> {

    @Override
    public int compare(Disco o1, Disco o2){
        return o1.getGenero().compareTo(o2.getGenero());
    }
}
