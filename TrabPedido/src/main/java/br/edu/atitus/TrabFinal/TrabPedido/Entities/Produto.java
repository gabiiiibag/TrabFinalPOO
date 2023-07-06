package br.edu.atitus.TrabFinal.TrabPedido.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto extends GenericEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private double valorUnitario;

    @Column(length = 300)
    private String descricao;

    @Column
    private String unidadeMedida;

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}