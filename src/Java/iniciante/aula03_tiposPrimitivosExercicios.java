package Java.iniciante;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem;

Eu <nome>, morador do endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.
*/
public class aula03_tiposPrimitivosExercicios{
    public static void main(String[] args){
        String nome = "Wilyan";
        String endereco = "Travessa Bela Vista, N° 153";
        double salario = 53.631;
        String data = "21/03/2024";
        String relatorio = "Eu "+nome+", morador do endereço "+endereco+",\nconfirmo que recebi o salário de R$"+salario+", na data "+data;
        System.out.println(relatorio);
    }
}
