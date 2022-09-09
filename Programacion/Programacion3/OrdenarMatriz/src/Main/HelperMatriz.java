package Main;

public class HelperMatriz {
    //Metodo que transpone mi matriz para cambiar de fila a columna o columna  a fila
    public static int[][] transponerMatriz(int matriz[][]){
        int matrizAux[][] = new int [matriz[0].length][matriz.length]; //Creo matriz auxiliar inversa a matriz principal
        //Recorro toda la matriz principal
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matrizAux[y][x] = matriz[x][y]; //asignos los valores invertidos
            }
        }
        return matrizAux;
    }

    //Ordena matriz de forma ascendente
    public static int[][] ordenarMatrizAsc(int matriz[][]){
        int matrizAux[][] = new int [matriz.length][matriz[0].length]; //Creo una matriz auxiliar del mismo tamanio que la original
        int aux,x=0,y=0;
        for(int i = 0; i < matriz.length*matriz[0].length; i++){ //Recorro todo por la cantidad de valores que tiene mi matriz
            int min = 999999999;
            for(int j = 0; j < matriz.length; j++){
                for(int k = 0; k < matriz[0].length; k++){
                    if(matriz[j][k] < min){ //pregunto por el minimo
                        //realizo el cambio con una variable auxiliar
                        aux = min;
                        min = matriz[j][k];
                        matriz[j][k] = aux;
                    }
                }
            }
            matrizAux[y][x] = min; //guardo en la matriz auxiliar el nuevo min
            x++;
            if(x == matrizAux[0].length){
                x=0;
                y++;
            }
        }
        return matrizAux;
    }

    public static int[][] ordenarMatrizDesc(int matriz[][]){
        int matrizAux[][] = new int [matriz.length][matriz[0].length]; //Creo una matriz auxiliar del mismo tamanio que la original
        int aux,x=0,y=0;
        for(int i = 0; i < matriz.length*matriz[0].length; i++){//Recorro todo por la cantidad de valores que tiene mi matriz
            int max = -999999999;
            for(int j = 0; j < matriz.length; j++){
                for(int k = 0; k < matriz[0].length; k++){
                    if(matriz[j][k] > max){ //pregunto por el maximo
                        //realizo el cambio con una variable auxiliar
                        aux = max;
                        max = matriz[j][k];
                        matriz[j][k] = aux;
                    }
                }
            }
            matrizAux[y][x] = max; //guardo en la matriz auxiliar el nuevo max
            x++;
            if(x == matrizAux[0].length){
                x=0;
                y++;
            }
        }
        return matrizAux;
    }

}
