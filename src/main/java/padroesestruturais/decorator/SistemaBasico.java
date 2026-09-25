package padroesestruturais.decorator;

public class SistemaBasico implements SistemaSeguranca {

    public float custoBase;

    public SistemaBasico() {
    }

    public SistemaBasico(float custoBase) {
        this.custoBase = custoBase;
    }

    public float getCustoBase() {
        return custoBase;
    }

    public String getCamadasProtecao() {
        return "Sistema Básico";
    }
}