package Java.POO.exercicios.exercicio03;
import java.util.Random;
public class mainCombate {
    public static void main(String[] args) {
    lutadores L[]  = new lutadores[6];
    luta horaDeLutar = new luta();
    L[0] = new lutadores("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 3);
    L[1] = new lutadores("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
    L[2] = new lutadores("Snapshahow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
    L[3] = new lutadores("Deadcode", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
    L[4] = new lutadores("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    L[5] = new lutadores("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        Random aleatorio = new Random();
        int desafiante = aleatorio.nextInt(5);
        int desafiado = aleatorio.nextInt(5);
        horaDeLutar.marcarluta(L[desafiante], L[desafiado]);
        horaDeLutar.lutar();





    }
}