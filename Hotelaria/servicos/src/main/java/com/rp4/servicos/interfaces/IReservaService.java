package com.rp4.servicos.interfaces;

import com.rp4.servicos.model.Servico;

public interface IReservaService {
    void saveReserva(Servico servico);

    public Servico updateReserva(Servico servico);

    public Servico findServicoById(Long id);

    void deleteReserva(Long id);
}
