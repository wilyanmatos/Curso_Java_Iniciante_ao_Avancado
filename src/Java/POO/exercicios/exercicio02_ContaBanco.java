package Java.POO.exercicios;

public class exercicio02_ContaBanco {
    public static void main(String[] args) {
        exercicio02_classContaBanco usr = new exercicio02_classContaBanco();
        usr.abrirConta("CC");
        System.out.println("Status atual: " + usr.getStatus());
        System.out.println("Saldo atual: " + usr.getSaldo());
        usr.fecharConta();
        usr.sacar(50);
        System.out.println("Seu saldo atual é de: " + usr.getSaldo());
        usr.depositar(100.25f);
        usr.sacar(25.5f);
        System.out.println("Seu saldo total é de: " + usr.getSaldo());
    }
}
