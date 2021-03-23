package com.rp4.hotelaria.model;

import com.rp4.hotelaria.Enuns.Status;

import javax.persistence.*;

@Entity
@Table(name = "tbl_registro_manutancao")
public class Manutancao {

    @Id
    @Column(name = "id_manutencao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_manutencao;


}
