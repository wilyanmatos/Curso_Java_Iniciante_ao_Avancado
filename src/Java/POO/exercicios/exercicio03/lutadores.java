package Java.POO.exercicios.exercicio03;

public class lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public lutadores(String no, String na, int ida, float alt, float peso, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = ida;
        this.altura = alt;
        this.setPeso(peso);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public void apresentar() {
        System.out.println("Apresentamos o lutador, " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m");
        System.out.println("pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias ");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("");
    }

    public void status() {
        System.out.println("#----------STATUS----------#");
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if(getPeso() < 52.2){
            this.categoria = "Invalido";
        }
        else if(getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if(getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if(getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

