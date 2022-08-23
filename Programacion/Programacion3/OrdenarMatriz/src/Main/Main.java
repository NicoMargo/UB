package Main;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = {{55,33,22,5},{1,4,99,0},{14,63,46,91}};
        int matriz2[][] = {{55,33,22,5},{1,4,99,0},{14,63,46,91}};

        mostrarMatriz(ordenarMatrizAsc(matriz));
        System.out.println(" ");

        //mostrarMatriz(transponerMatriz(matriz));
        System.out.println(" ");

        mostrarMatriz(ordenarMatrizDesc(matriz2));
        System.out.println(" ");

        //mostrarMatriz(transponerMatriz(matriz2));




    }

    private static int[][] transponerMatriz(int matriz[][]){
        int matrizAux[][] = new int [matriz.length][matriz[0].length];
        int x=0, y=0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizAux[j][i] = matriz[i][j];
            }
        }
        return matrizAux;
    }


    private static int[][] ordenarMatrizAsc(int matriz[][]){
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

    private static int[][] ordenarMatrizDesc(int matriz[][]){
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
    private static void mostrarMatriz(int matriz[][]){
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
