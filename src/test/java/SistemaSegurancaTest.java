package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaSegurancaTest {

    @Test
    void deveRetornarCustoSistemaBasicoComCriptografia() {
        SistemaSeguranca sistema = new SistemaBasico(1000.0f);
        sistema = new ModuloCriptografia(sistema); // +20%

        assertEquals(1200.0f, sistema.getCustoBase(), 0.01f);
        assertEquals("Sistema Básico/Criptografia", sistema.getCamadasProtecao());
    }

    @Test
    void deveRetornarCustoSistemaBasicoComIDS() {
        SistemaSeguranca sistema = new SistemaBasico(1000.0f);
        sistema = new ModuloIDS(sistema); // +10%

        assertEquals(1100.0f, sistema.getCustoBase(), 0.01f);
        assertEquals("Sistema Básico/IDS", sistema.getCamadasProtecao());
    }

    @Test
    void deveRetornarCustoSistemaBasicoComBackup() {
        SistemaSeguranca sistema = new SistemaBasico(1000.0f);
        sistema = new ModuloBackup(sistema); // +5%

        assertEquals(1050.0f, sistema.getCustoBase(), 0.01f);
        assertEquals("Sistema Básico/Backup", sistema.getCamadasProtecao());
    }

    @Test
    void deveRetornarCustoSistemaComMultiplasCamadas() {
        // Sistema Básico (1000) + Criptografia (20%) + IDS (10%)
        // Cálculo: 1000 * 1.20 = 1200. 1200 * 1.10 = 1320.0
        SistemaSeguranca sistema = new SistemaBasico(1000.0f);
        sistema = new ModuloCriptografia(sistema);
        sistema = new ModuloIDS(sistema);

        assertEquals(1320.0f, sistema.getCustoBase(), 0.01f);
        assertEquals("Sistema Básico/Criptografia/IDS", sistema.getCamadasProtecao());
    }
}