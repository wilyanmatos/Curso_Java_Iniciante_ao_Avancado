package Java.iniciante;

public class aula_05_Condicionais_Vazio {
    public static void main(String[] args) {
        // Switch case
        // Imprima o dia da semana, considerando o 1 como domingo
        byte dia = 3;
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }


}
