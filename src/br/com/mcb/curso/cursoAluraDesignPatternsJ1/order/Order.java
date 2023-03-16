package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order;

import java.time.LocalDateTime;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class Order {

	private String client;
	private LocalDateTime date;
	private Budget budget;

	public Order(String client, LocalDateTime date, Budget budget) {
		super();
		this.client = client;
		this.date = date;
		this.budget = budget;
	}

	public String getClient() {
		return client;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public Budget getBudget() {
		return budget;
	}

}
