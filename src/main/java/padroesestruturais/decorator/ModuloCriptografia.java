package padroesestruturais.decorator;

public class ModuloCriptografia extends CamadaSegurancaDecorator {

    public ModuloCriptografia(SistemaSeguranca sistema) {
        super(sistema);
    }

    public float getPercentualCusto() {
        return 20.0f;
    }

    public String getNomeCamada() {
        return "Criptografia";
    }
}