package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order;

import java.math.BigDecimal;

public class OrderGenerate {

	private String client;
	private BigDecimal budgetValue;
	private Integer itemsQuantity;

	public OrderGenerate(String client, BigDecimal budgetValue, Integer itemsQuantity) {
		super();
		this.client = client;
		this.budgetValue = budgetValue;
		this.itemsQuantity = itemsQuantity;
	}

	public String getClient() {
		return client;
	}

	public BigDecimal getBudgetValue() {
		return budgetValue;
	}

	public Integer getItemsQuantity() {
		return itemsQuantity;
	}

}
