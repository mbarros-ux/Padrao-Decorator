package padroesestruturais.decorator;

public class ModuloBackup extends CamadaSegurancaDecorator {

    public ModuloBackup(SistemaSeguranca sistema) {
        super(sistema);
    }

    public float getPercentualCusto() {
        return 5.0f;
    }

    public String getNomeCamada() {
        return "Backup";
    }
}