package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget;

import java.math.BigDecimal;

public class Budget {

	private BigDecimal value;
	private Integer quantity;


	public Budget(BigDecimal value, Integer quantity) {
		super();
		this.value = value;
		this.quantity = quantity;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantity() {
		return quantity;
	}

}
