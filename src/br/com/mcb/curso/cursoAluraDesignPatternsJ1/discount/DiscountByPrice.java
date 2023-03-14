package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class DiscountByPrice extends Discount {

	public DiscountByPrice(Discount next) {
		super(next);
	}

	@Override
	public BigDecimal applyDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean canApplyDiscount(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal(500)) > 0;
	}


}
