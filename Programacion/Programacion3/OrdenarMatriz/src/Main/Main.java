package Main;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = {{55,33,22,5},{1,4,99,0},{14,63,46,91}};

        int u[][] = ordenarMatrizAsc(matriz);
    }

    public static int[][] ordenarMatrizAsc(int matriz[][]){
        int matrizAux[][] = new int [matriz.length][matriz[0].length];
        int aux,x=0,y=0;
        for(int i = 0; i < matriz.length*matriz[0].length; i++){
            int min = 999999999;
            for(int j = 0; j < matriz.length; j++){
                for(int k = 0; k < matriz[0].length; k++){
                    if(matriz[j][k] < min){
                        aux = min;
                        min = matriz[j][k];
                        matriz[j][k] = aux;
                    }
                }
            }
            matrizAux[y][x] = min;
            x++;
            if(y == matrizAux[0].length){
                x=0;
                y++;
            }
        }
        return matrizAux;

    }
}
