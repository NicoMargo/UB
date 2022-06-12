package Main;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido Al sistema de Never-NO");

        //CREO 3 TRANSPORTES DE PRUEBA. CADA TRANSPORTE VAN A SER DE TIPOS DE CARGA DISTINTOS PARA PROBAR TODO EL PROGRAMA
        //CODIGOS: 0 = SANTA FE; 1 = BARILOCHE; 2 = CABA

        Transporte transporte1 = new Transporte(1,2, "EAI363");
        Transporte transporte2 = new Transporte(0,0,"AD841FJ");
        Transporte transporte3 = new Transporte(2,0,"AF117VI");

        //CREO 5 TIPOS DE ALIMETNOS PARA EL TRANSPORTE 1
        Alimento alimento1 = new Alimento(10, "queso", 0.5);
        Alimento alimento2 = new Alimento(5, "pan", 1);
        Alimento alimento3 = new Alimento(20, "manteca", 1.5);
        Alimento alimento4 = new Alimento(3, "choclo", 1);
        Alimento alimento5 = new Alimento(1, "pizza", 2);

        //AGREGO LOS 5 TIPOS DE ALIMENTOS A LA LISTA DEL TRANSPORTE1
        transporte1.listaDeLaCarga.add(alimento1);
        transporte1.listaDeLaCarga.add(alimento2);
        transporte1.listaDeLaCarga.add(alimento3);
        transporte1.listaDeLaCarga.add(alimento4);
        transporte1.listaDeLaCarga.add(alimento5);

        //MUESTRO EL PRECIO DEL TRANSPORTE 1
        System.out.println("El precio del transporte 1 es: " + transporte1.precioTransporte());







        //CREO 5 TIPOS DE Animales PARA EL TRANSPORTE 2
        Animal animal1 = new Animal(5);
        Animal animal2 = new Animal(10);
        Animal animal3 = new Animal(15);
        Animal animal4 = new Animal(20);
        Animal animal5 = new Animal(25);


        //AGREGO LOS 5 TIPOS DE Animales A LA LISTA DEL TRANSPORTE2
        transporte2.listaDeLaCarga.add(animal1);
        transporte2.listaDeLaCarga.add(animal2);
        transporte2.listaDeLaCarga.add(animal3);
        transporte2.listaDeLaCarga.add(animal4);
        transporte2.listaDeLaCarga.add(animal5);

        //MUESTRO EL PRECIO DEL TRANSPORTE 2
        System.out.println("El precio del transporte 2 es: " + transporte2.precioTransporte());





        //CREO 3 BULTOS PARA EL TRANSPORTE 3
        Bulto bulto1 = new Bulto(5,15);
        Bulto bulto2 = new Bulto(20,80);
        Bulto bulto3 = new Bulto(15,120);


        //AGREGO LOS 3 BULTOS A LA LISTA DEL TRANSPORTE3
        transporte3.listaDeLaCarga.add(bulto1);
        transporte3.listaDeLaCarga.add(bulto2);
        transporte3.listaDeLaCarga.add(bulto3);

        //MUESTRO EL PRECIO DEL TRANSPORTE 3
        System.out.println("El precio del transporte 3 es: " + transporte3.precioTransporte());


    }
}
