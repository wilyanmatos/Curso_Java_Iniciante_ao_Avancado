package Java.POO;
public class aula_02_definindoVisibilidade {
    public static void main(String[] args) {
        caneta a1 = new caneta();
        a1.modelo = "BIC Cristal";
        a1.cor = "Azul";
        a1.carga = 80;
        a1.tampar();
        a1.status();
    }
}
