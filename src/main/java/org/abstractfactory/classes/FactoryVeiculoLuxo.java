package org.abstractfactory.classes;


public class FactoryVeiculoLuxo implements AbstractFactory {
    @Override
    public AluguelVeiculo criarAluguel() {
        return new AluguelVeiculoLuxo();
    }

    @Override
    public VendaVeiculo criarVenda() {
        return new VendaVeiculoLuxo();
    }
}
