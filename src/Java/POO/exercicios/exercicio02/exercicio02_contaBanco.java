package Java.POO.exercicios.exercicio02;

public class exercicio02_contaBanco {
    public static void main(String[] args) {
        exercicio02_classContaBanco contaBanco01 = new exercicio02_classContaBanco();
        contaBanco01.setnumConta(111);
        contaBanco01.setDono("Jubileu");
        contaBanco01.abrirConta("CC");


        exercicio02_classContaBanco contaBanco02 = new exercicio02_classContaBanco();
        contaBanco02.setnumConta(222);
        contaBanco02.setDono("Creuza");
        contaBanco02.abrirConta("CP");


        contaBanco01.depositar(100);
        contaBanco02.depositar(500);

        contaBanco02.sacar(100);
        contaBanco01.sacar(150);

        contaBanco01.fecharConta();

        contaBanco01.estadoAtual();
        contaBanco02.estadoAtual();
    }
}
