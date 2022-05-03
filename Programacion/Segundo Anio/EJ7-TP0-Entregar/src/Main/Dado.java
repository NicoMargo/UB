package Main;
import java.util.Random;
public class Dado
{
    private short dadoValor;
    private Random random = new Random();

    public Dado(){
    }

    public short getDadoValor() {
        return dadoValor;
    }

    public void setDadoValor() {
        this.dadoValor = (short)(random.nextInt(5)+1);        
    }
}
