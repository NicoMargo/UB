package Main;

import static Main.Helper.*;
import java.util.Random;

public class Cubo {
    private int[][][] matriz;
    public Cubo(short[] dimensionesCubo){
        matriz = new int[dimensionesCubo[2]][dimensionesCubo[1]][dimensionesCubo[0]];
        randomCubo();
    }

    public void mostrarCubo(){
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++)
                for (int z = 0; z < matriz[0][0].length; z++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + matriz[i][j][z]);
    }
    public void randomCubo(){
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++)
                for (int z = 0; z < matriz[0][0].length; z++){
                    int value = random.nextInt(100 + 1) + 1;
                    matriz[i][j][z] = value;
                }
        System.out.println("Se cargaron valores random al cubo");
    }
    public void cargarCubo(){
        short[] posCubo = new short[3];
        System.out.println("-----------------------------");

        posCubo[0] = ingresoShortValidoNeutro("Ingrese pos en z del cubo");

        posCubo[1] = ingresoShortValidoNeutro("Ingrese pos en y del cubo");

        posCubo[2] = ingresoShortValidoNeutro("Ingrese pos en x del cubo");

        try{
            if (matriz[posCubo[2]][posCubo[1]][posCubo[0]] == 0) {
                short valor = ingresoShortValidoZ("Ingrese valor para la posicion");
                if(valor != 0)
                    matriz[posCubo[2]][posCubo[1]][posCubo[0]] = valor;
                else
                    System.err.println("No puede ingresar 0, use opcion anular");

            }else {
                System.err.println("El valor no es 0, utilice metodo modificar");
            }
        }catch (Exception e){
            System.err.println("Posiciones de cubo incorrectas");
        }


    }

    public void modificarCubo(){
        short[] posCubo = new short[3];
        System.out.println("-----------------------------");

        posCubo[0] = ingresoShortValidoNeutro("Ingrese pos en z del cubo");

        posCubo[1] = ingresoShortValidoNeutro("Ingrese pos en y del cubo");

        posCubo[2] = ingresoShortValidoNeutro("Ingrese pos en x del cubo");

        try{
            if (matriz[posCubo[2]][posCubo[1]][posCubo[0]] != 0) {
                short valor = ingresoShortValidoZ("Ingrese valor para la posicion");
                if(valor != 0)
                    matriz[posCubo[2]][posCubo[1]][posCubo[0]] = valor;
                else
                    System.err.println("No puede ingresar 0, use opcion anular");

            }else {
                System.err.println("El valor es 0, utilice metodo cargar");
            }
        }catch (Exception e){
            System.err.println("Posiciones de cubo incorrectas");
        }


    }

    public void anularCubo(){
        short[] posCubo = new short[3];
        System.out.println("-----------------------------");

        posCubo[0] = ingresoShortValidoNeutro("Ingrese pos en z del cubo");

        posCubo[1] = ingresoShortValidoNeutro("Ingrese pos en y del cubo");

        posCubo[2] = ingresoShortValidoNeutro("Ingrese pos en x del cubo");

        try{
            matriz[posCubo[2]][posCubo[1]][posCubo[0]] = 0;
        }catch (Exception e){
            System.err.println("Posiciones de cubo incorrectas");
        }


    }
    public void mostrarCuboNulos(){
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++)
                for (int z = 0; z < matriz[0][0].length; z++){
                    if(matriz[i][j][z] == 0)
                        System.out.println("arr[" + i
                                + "]["
                                + j + "]["
                                + z + "] = "
                                + matriz[i][j][z]);
                }
                System.out.println("");
                System.out.println("-----------------------------------");


    }




}

