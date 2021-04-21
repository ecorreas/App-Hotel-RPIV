package com.rp4.consumoservice.interfaces;

import com.rp4.consumoservice.model.Consumo;

public interface IConsumoService {
    void saveConsumo(Consumo consumo);
    public Consumo updateConsumo(Consumo consumo);
    public Consumo findConsumoById(Long id);
    void deleteConsumo(Long id);
}
