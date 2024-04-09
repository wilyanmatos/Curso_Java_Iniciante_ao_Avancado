package Java.POO.exercicios;

public class aula01_exercicio {
    public static void main(String[] args) {
        // Crie uma classe com objetos concretos
        aula01_classLivro livro_01 = new aula01_classLivro();
        livro_01.nome = "O grande conflito";
        livro_01.capa = "comum";
        livro_01.idioma = "Potuguês";
        livro_01.paginas = 295;
        livro_01.aberto = false;
        livro_01.abrir_livro();
        livro_01.ler();
    }
}
