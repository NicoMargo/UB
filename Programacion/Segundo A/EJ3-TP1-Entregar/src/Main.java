public class Main {
    public static void main(String []args) {
        System.out.println("Bienvenido a su catalogo de peliculas");
        short operacion;
        operacion = Helper.nuevaOperacion();
        switch(operacion){
            case 1:
                Catalogo.nuevoDVD();
                break;
            case 2:
                System.out.println("Ya sabe que va a comprar con el dinero que gane?");
                break;
            case 3:
                System.out.println("Va a comprar criptomonedas con ese dinero?");
                break;
            case 4:
                System.out.println("Un tiro mas y ganara la jugada!");
                break;
            case 5:
                System.out.println("Se esta yendo a la quiebra? Siga jugando! ");
                break;
            case 6:
                System.out.println("Siga jugando craps para darle una buena educacion a sus hijos");
                break;
            case 7:
                System.out.println("Oh, vamos, arriesguese!");
                break;
            case 8:
                System.out.println("Que lindo dia para ganar, no?");
                break;
            case 9:
                System.out.println("Adios! Que tenga un grandioso dia :)");
                break;
        }

    }
}
