package Main;

public class Jugador {

    private double saldoBanco = 1000;
    Dado dado1 = new Dado();
    Dado dado2 = new Dado();

    public short tirarDados(){
        dado1.setDadoValor();
        dado2.setDadoValor();
        return (short)(dado1.getDadoValor() + dado2.getDadoValor());
    }
    public double getSaldoBanco(){
        return  saldoBanco;
    }
    public void setSaldoBanco(double saldo){
        saldoBanco = saldo;
    }

    public Jugador(){

    }
}
