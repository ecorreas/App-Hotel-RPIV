package com.rp4.consumoservice.model;

import javax.persistence.*;

@Entity
@Table(name = "consumo_produto")
public class ConsumoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="id_produto")
    private Long idProduto;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consumo",referencedColumnName = "id_consumo", nullable = false)
    private Consumo consumo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }
}
