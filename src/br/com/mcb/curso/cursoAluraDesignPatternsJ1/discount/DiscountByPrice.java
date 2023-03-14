package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class DiscountByPrice extends Discount {

	public DiscountByPrice(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if(budget.getValue().compareTo(new BigDecimal(500)) > 0) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		
		return next.calculate(budget);
	}
	
}
