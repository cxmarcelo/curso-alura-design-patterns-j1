package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}

	
	protected BigDecimal calculate(Budget budget) {
		if(canApplyDiscount(budget)) {
			return applyDiscount(budget);
		}
		return next.calculate(budget);
	}
	
	protected abstract BigDecimal applyDiscount(Budget budget);
	
	protected abstract boolean canApplyDiscount(Budget budget);

}
