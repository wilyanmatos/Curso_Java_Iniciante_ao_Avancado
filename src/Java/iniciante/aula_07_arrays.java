package Java.iniciante;

public class aula_07_arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // Forma diferente de definir e imprimir os arrays
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        /*for (int i = 0; i < nomes.length ; i++) {
            String[] novo_nomes = {nomes[i]};
            System.out.println(novo_nomes[i]);
        }*/
        // foreach
        /*for(int num: numeros2){
            System.out.println(num);
        }
        */
        // array multidimensional
        int lista[][] = new int[3][3];
        lista[0][0] = 1;
        lista[0][1] = 2;
        lista[0][2] = 3;

        lista[1][0] = 4;
        lista[1][1] = 5;
        lista[1][2] = 6;

        lista[2][0] = 7;
        lista[2][1] = 8;
        lista[2][2] = 9;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.println(lista[i][j]);
            }
        }
    }

}
