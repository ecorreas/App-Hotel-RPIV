package com.rp4.reservaservice.dto;

import com.rp4.reservaservice.model.Reserva;

public class ReservaQuartoDTO {

    private Long id;
    private Long idQuarto;
    private Reserva reserva;

    public ReservaQuartoDTO(Long id, Long idQuarto, Reserva reserva) {
        this.id = id;
        this.idQuarto = idQuarto;
        this.reserva = reserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
