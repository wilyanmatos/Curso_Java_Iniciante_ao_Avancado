package Java.POO.exercicios;

public class exercicio01_classLivro {
    String nome;
    String idioma;
    int paginas;
    String capa;
    boolean aberto;

    void abrir_livro(){
        if (aberto == false){
            System.out.println("O livro '"+this.nome+"' foi aberto");
            this.aberto = true;
        }else{
            System.out.println("O livro já está aberto");
        }
    }
    void ler(){
        if(aberto == true){
            System.out.println("Lendo livro...");
        }else{
            System.out.println("ERRO! O livro não está aberto");
        }
    }

    void status(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idioma: "+ this.idioma);
        System.out.println("Páginas: "+ this.paginas);
        System.out.println("Tipo de capa: "+this.capa);
        System.out.println("O livro está aberto? "+ aberto);
    }

}
