package Java.POO.exercicios;

public class exercicio02_classContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipoConta){
        setStatus(true);
        setTipo(tipoConta);
        if(tipoConta == "CC"){
            System.out.println("Conta corrente criada!\nVocê recebeu R$50");
            setSaldo(50);
        }else if(tipoConta == "CP"){
            System.out.println("Conta poupança criada!\nVocê recebeu R$150");
            setSaldo(150);
        }else{
            System.out.println("ERRO! Por favor informe novamente o tipo de conta");
        }
    }
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("ERRO! Não é possível fechar a conta pois ainda possui valores");
        }else{
            System.out.println("Conta fechada");
            setStatus(false);
        }
    }
    public void depositar(float novoDeposito){
        this.saldo += novoDeposito;
        System.out.println("Você depositou: "+ novoDeposito);
    }
    public void sacar(float novoSaque){
        if(novoSaque > getSaldo()){
            System.out.println("ERRO! Saque maior que o saldo!");
        }else{
            System.out.println("Você sacou R$" + novoSaque);
            setSaldo(-novoSaque);
        }
    }
    public void pagarMensal(){}

    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int novoNumConta){
        this.numConta = novoNumConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String novoTipo){
        this.tipo = novoTipo;
    }
    public void getDono(){}
    public void setDono(){}
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float novoValor){
        this.saldo += novoValor;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean novoStatus){
        this.status = novoStatus;
    }


}
