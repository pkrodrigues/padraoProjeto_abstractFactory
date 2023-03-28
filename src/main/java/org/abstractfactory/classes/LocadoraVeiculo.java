package org.abstractfactory.classes;

public class LocadoraVeiculo {
    private VendaVeiculo vendaVeiculo;
    private AluguelVeiculo aluguelVeiculo;

    public LocadoraVeiculo(AbstractFactory factory){
        this.aluguelVeiculo = factory.criarAluguel();
        this.vendaVeiculo = factory.criarVenda();
    }

    public String emitirNotaVenda() {
        return this.vendaVeiculo.emitirNotaFiscal();
    }

    public String emitirNotaAluguel() {
        return this.aluguelVeiculo.emitirNotaFiscal();
    }
}
