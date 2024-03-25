package Java.iniciante;

public class aula_05_CondicionaisExercicio {
    public static void main(String[] args){
        // Calcular juros de acordo com o salário
        /*  €0 até  € 34,712 Juros de 9.70%
            €34,713 até € 68,587 Juros de 37.35%
            Acima de €68,588 Juros de 49.50%
         */
        double salarioAnual = 1500;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double tericeiraFaixaa = 49.50 / 100;
        double valorDoImposto;
        if (salarioAnual <= 34712){
            valorDoImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68587){
            valorDoImposto = salarioAnual * segundaFaixa;
        }else{
            valorDoImposto = salarioAnual * tericeiraFaixaa;
        }
        System.out.println("Você pagará: "+valorDoImposto);
    }
}
