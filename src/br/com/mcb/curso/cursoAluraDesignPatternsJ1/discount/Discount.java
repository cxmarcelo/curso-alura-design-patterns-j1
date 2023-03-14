package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}

	public abstract BigDecimal calculate(Budget budget);

}
