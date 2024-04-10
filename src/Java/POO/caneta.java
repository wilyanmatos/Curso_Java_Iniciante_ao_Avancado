package Java.POO;
public class caneta {
    public String modelo;
    private float ponta;
    private boolean tampar;
    public String cor;

    public caneta(String modelo, String cor, float ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampar() {
        return tampar;
    }

    public void setTampar(boolean tampar) {
        this.tampar = tampar;
    }
}