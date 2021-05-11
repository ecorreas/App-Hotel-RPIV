package com.rp4.reservaPasseioTuristico.model;


import javax.persistence.*;

@Entity
@Table(name = "reserva_turismo")

public class ReservaTurismo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_turismo")
    private Long idTurismo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdQuarto() {
        return idTurismo;
    }

    public void setIdQuarto(Long idTurismo) {
        this.idTurismo = idTurismo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
