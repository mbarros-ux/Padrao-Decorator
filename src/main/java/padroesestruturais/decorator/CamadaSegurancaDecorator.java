package padroesestruturais.decorator;

public abstract class CamadaSegurancaDecorator implements SistemaSeguranca {

    private SistemaSeguranca sistema;
    public String camada;

    public CamadaSegurancaDecorator(SistemaSeguranca sistema) {
        this.sistema = sistema;
    }

    public SistemaSeguranca getSistema() {
        return sistema;
    }

    public void setSistema(SistemaSeguranca sistema) {
        this.sistema = sistema;
    }

    public abstract float getPercentualCusto();

    public float getCustoBase() {
        return this.sistema.getCustoBase() * (1 + (this.getPercentualCusto() / 100));
    }

    public abstract String getNomeCamada();

    public String getCamadasProtecao() {
        return this.sistema.getCamadasProtecao() + "/" + this.getNomeCamada();
    }

    public void setCamada(String camada) {
        this.camada = camada;
    }
}