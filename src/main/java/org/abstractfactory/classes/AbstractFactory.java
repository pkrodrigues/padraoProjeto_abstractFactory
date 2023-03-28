package org.abstractfactory.classes;

public interface AbstractFactory {
    AluguelVeiculo criarAluguel();
    VendaVeiculo criarVenda();
}
