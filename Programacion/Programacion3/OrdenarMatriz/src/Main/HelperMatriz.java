package Main;

public class HelperMatriz {
    public static int[][] transponerMatriz(int matriz[][]){
        int matrizAux[][] = new int [matriz[0].length][matriz.length];
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matrizAux[y][x] = matriz[x][y];
            }
        }
        return matrizAux;
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
            if(x == matrizAux[0].length){
                x=0;
                y++;
            }
        }
        return matrizAux;
    }

    public static int[][] ordenarMatrizDesc(int matriz[][]){
        int matrizAux[][] = new int [matriz.length][matriz[0].length];
        int aux,x=0,y=0;
        for(int i = 0; i < matriz.length*matriz[0].length; i++){
            int max = -999999999;
            for(int j = 0; j < matriz.length; j++){
                for(int k = 0; k < matriz[0].length; k++){
                    if(matriz[j][k] > max){
                        aux = max;
                        max = matriz[j][k];
                        matriz[j][k] = aux;
                    }
                }
            }
            matrizAux[y][x] = max;
            x++;
            if(x == matrizAux[0].length){
                x=0;
                y++;
            }
        }
        return matrizAux;
    }
    public static void mostrarMatriz(int matriz[][]){
        String vec = "";
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                vec += matriz[i][j] + " ";
            }
            System.out.println(vec);
            vec ="";
        }

    }
}
