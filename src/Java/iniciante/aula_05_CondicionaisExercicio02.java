package Java.iniciante;

public class aula_05_CondicionaisExercicio02 {
    public static void main(String[] args) {
        // Condições com Switch
        // Utilizando switch e dados os valores de 1 a 7 imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo
        byte dia = 7;
        String dia_semana;
        switch(dia){
            default:
                dia_semana = "Dia inválido";
                break;
            case 1:
                dia_semana = "Domingo";
                break;
            case 2:
                dia_semana = "Segunda-Feira";
                break;
            case 3:
                dia_semana = "Terça-Feira";
                break;
            case 4:
                dia_semana = "Quarta-Feira";
                break;
            case 5:
                dia_semana = "Quinta-Feira";
                break;
            case 6:
                dia_semana = "Sexta-Feira";
                break;
            case 7:
                dia_semana = "Sábado";
                break;
        }   
        if(dia_semana == "Sábado" || dia_semana == "Domingo"){
            System.out.println("Dia: "+dia_semana+" - Fim de semana");
        }else{
            System.out.println("Dia: "+dia_semana+" - Dia útil");
        }

}
}