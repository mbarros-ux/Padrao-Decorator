package padroesestruturais.decorator;

public class ModuloIDS extends CamadaSegurancaDecorator {

    public ModuloIDS(SistemaSeguranca sistema) {
        super(sistema);
    }

    public float getPercentualCusto() {
        return 10.0f;
    }

    public String getNomeCamada() {
        return "IDS";
    }
}