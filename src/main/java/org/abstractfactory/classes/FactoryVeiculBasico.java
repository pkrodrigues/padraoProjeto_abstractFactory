package org.abstractfactory.classes;

public class FactoryVeiculBasico implements AbstractFactory{
    @Override
    public VendaVeiculo criarVenda() {
        return new VendaVeiculoBasico();
    }

    @Override
    public AluguelVeiculo criarAluguel() {
        return new AluguelVeiculoBasico();
    }
}
