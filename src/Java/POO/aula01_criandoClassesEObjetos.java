package Java.POO;
public class aula01_criandoClassesEObjetos {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();

        caneta c2 = new caneta();
        c2.cor = "Preta";
        c2.modelo = "Hostnet";
        c2.destampar();
        c2.rabiscar();
    }
}
