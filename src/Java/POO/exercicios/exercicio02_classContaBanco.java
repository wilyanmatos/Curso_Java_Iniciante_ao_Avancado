package Java.POO.exercicios;

public class exercicio02_classContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public exercicio02_classContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    public void estadoAtual(){
        System.out.println("------------------------");
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Número da conta: "+ this.getnumConta());
        System.out.println("Status: "+ this.getStatus());
        System.out.println("Saldo: "+ this.getSaldo());
    }
    public void abrirConta(String tipoConta){
        this.setStatus(true);
        this.setTipo(tipoConta);
        if(tipoConta == "CC"){
            this.setSaldo(this.getSaldo() + 50);
            System.out.println("Conta corrente aberta com sucesso");
        }else if(tipoConta == "CP"){
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("Conta poupança aberta com sucesso");
        }else{
            System.out.println("ERRO! Por favor informe novamente o tipo de conta");
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("ERRO! Não é possível fechar a conta pois ainda possui valores");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois possue debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float novoDeposito){
        if(this.getStatus()) {
            setSaldo(this.getSaldo() + novoDeposito);
            System.out.println(this.getDono()+" depositou: R$"+ novoDeposito);
        }else {
            System.out.println("Sua conta não está aberta");
        }
    }
    public void sacar(float novoSaque){
        if(this.getStatus()){
            if(novoSaque <= this.getSaldo()) {
                System.out.println("Saque de R$" + novoSaque +" realizado na conta ["+this.getDono()+"]");
                setSaldo(this.getSaldo() - novoSaque);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("A conta não está aberta");
            }
        }

    public void pagarMensal(){
        float cobrarMensalidade = 0;
        if(this.getTipo() == "CC"){
            cobrarMensalidade = 12;
        } else if (this.getTipo() == "CP") {
            cobrarMensalidade = 20;
        }
        if(getStatus()){
            this.setSaldo(this.getSaldo() - cobrarMensalidade);
            System.out.println("A mensalidade da conta "+ this.getTipo()+" foi paga: R$"+cobrarMensalidade);
        }else{
            System.out.println("ERRO! A conta não está aberta");
        }
    }

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
    public String getDono(){
        return this.dono;
    }
    public void setDono(String novoDono){
        this.dono = novoDono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float novoValor){
        this.saldo = novoValor;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean novoStatus){
        this.status = novoStatus;
    }


}
