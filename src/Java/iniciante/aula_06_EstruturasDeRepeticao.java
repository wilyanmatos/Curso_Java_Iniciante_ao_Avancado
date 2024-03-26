package Java.iniciante;

public class aula_06_EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for e break
        // while
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count += 1;
        }
        count = 0;

        // do while
        do {
            System.out.println("Do-while executado");
            count ++;
        }while(count < 10);

        // for
        for(int i=0; i < 10; i++){
            System.out.println("For: "+i);
        }


    }
}
