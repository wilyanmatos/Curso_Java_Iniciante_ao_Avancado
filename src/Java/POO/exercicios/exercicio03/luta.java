package Java.POO.exercicios.exercicio03;
import java.util.Random;

public class luta {
    private lutadores desafiado;
    private lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarluta(lutadores l1, lutadores l2){

        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("#---Desafiado---#");
            this.desafiado.apresentar();
            System.out.println("#---Desafiante---#");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int resultado = aleatorio.nextInt(3);
            System.out.println("======RESULTADO DA LUTA======");
            switch(resultado){
                case 0:
                    System.out.println("<---Houve um empate--->");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("--> " +desafiado.getNome() + " é o grande VENCEDOR!"+" <--");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("--> " + desafiante.getNome() + " é o grande VENCEDOR!"+" <--");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("A luta não vai acontecer");
        }
    }

    public void setDesafiado(lutadores lutador){
        this.desafiado = lutador;
    }
    public lutadores getDesafiado(){
        return desafiado;
    }

    public lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
