public class Main {
    public static void main(String []args) {
        System.out.println("Bienvenido al programa!");
        catalogoDisco.cargarDiscosPorDefecto(); //Se cargan algunos discos por defecto para no cargar manalmente xd
        byte catalogo,operacion;
        do{
            catalogo = Helper.elegirCatalogo(); //se elige el catalogo o salir
            if (catalogo == 1) { //si el catalogo elegido es dvd
                do {
                    operacion = Helper.nuevaOperacionDVD(); //Se elige la operacion DVD
                }while(Helper.iniciarOperacionDVD(operacion));//Se ejecuta la operacion DVD
            }else if(catalogo == 2){ //si el catalogo elegido es CD
                do {
                    operacion = Helper.nuevaOperacionCD();//Se elige la operacion CD
                }while(Helper.iniciarOperacionCD(operacion)); //Se ejecuta la operacion CD
            }
        }while (catalogo != 3); //Se repite todo hasta que se ingrese 3 que es salir
    }
}
