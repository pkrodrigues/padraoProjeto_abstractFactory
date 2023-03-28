import org.abstractfactory.classes.AbstractFactory;
import org.abstractfactory.classes.FactoryVeiculBasico;
import org.abstractfactory.classes.FactoryVeiculoLuxo;
import org.abstractfactory.classes.LocadoraVeiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocadoraVeiculoTest {
    @Test
    void deveEmitirNotaFiscalVendaVeiculoBasico() {
        AbstractFactory factory = new FactoryVeiculBasico();
        LocadoraVeiculo locadoraVeiculo = new LocadoraVeiculo(factory);
        assertEquals("Nota fiscal de venda de veiculo basico", locadoraVeiculo.emitirNotaVenda());
    }
    @Test
    void deveEmitirNotaFiscalAluguelVeiculoBasico() {
        AbstractFactory factory = new FactoryVeiculBasico();
        LocadoraVeiculo locadoraVeiculo = new LocadoraVeiculo(factory);
        assertEquals("Nota fiscal de aluguel de veiculo basico", locadoraVeiculo.emitirNotaAluguel());
    }
    @Test
    void deveEmitirNotaFiscalAluguelVeiculoLuxo() {
        AbstractFactory factory = new FactoryVeiculoLuxo();
        LocadoraVeiculo locadoraVeiculo = new LocadoraVeiculo(factory);
        assertEquals("Nota fiscal de aluguel de veiculo luxo", locadoraVeiculo.emitirNotaAluguel());
    }
    @Test
    void deveEmitirNotaFiscalVendaVeiculoLuxo() {
        AbstractFactory factory = new FactoryVeiculoLuxo();
        LocadoraVeiculo locadoraVeiculo = new LocadoraVeiculo(factory);
        assertEquals("Nota fiscal de venda de veiculo luxo", locadoraVeiculo.emitirNotaVenda());
    }

}
