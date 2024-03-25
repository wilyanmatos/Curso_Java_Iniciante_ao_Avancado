package Java.iniciante;

public class aula04_Operadores {
    public static void main(String[] arg){
        double numero_01 = 10;
        double numero_02 = 20;
        double resultado = numero_01 / numero_02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean DezMaiorQuevinte = 10 > 20;
        boolean DezMenorQueVinte = 10 < 20;
        boolean DezIgualDez = 10.5 == 10;
        boolean VinteDiferenteDeDez = 20 != 10.0;
        System.out.println("10 Maior que 20? "+DezMaiorQuevinte);
        System.out.println("10 Menor que 20? "+DezMenorQueVinte);
        System.out.println("10.5 Igual a 10? "+DezIgualDez);
        System.out.println("20 é diferente de 10.0? "+VinteDiferenteDeDez);

        // And(%%) Or(||) Not(!)
        // &
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQuetrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da Lei e maior que 30? "+isDentroDaLeiMaiorQuetrinta);
        System.out.println("Dentro da Lei e Menor que 30? "+isDentroDaLeiMenorQueTrinta);

        // Not||
        double valorTatalContaCorrente = 200;
        double ValorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTatalContaCorrente > valorPlaystation || valorTatalContaCorrente > valorPlaystation;
        System.out.println("O playstation é compravel? "+isPlaystationCincoCompravel);

        // = += -= /= %=
        // +=
        double bonus = 1800;
        bonus += 800;
        System.out.println("Adição de bonus:R$ "+bonus);
        bonus -= 1000;
        System.out.println("Redução de bonus:R$ "+bonus);
        bonus *=2;
        System.out.println("Multiplicação de bonus:R$ "+bonus);
        bonus /=2;
        System.out.println("Divisão do bonus:R$ "+bonus);
        bonus %=2;
        System.out.println("Resto da divisão do bonus:R$ "+bonus);
    }
}
