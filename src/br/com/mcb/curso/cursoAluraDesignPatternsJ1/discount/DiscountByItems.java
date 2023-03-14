package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class DiscountByItems extends Discount {

	public DiscountByItems(Discount next) {
		super(next);
	}

	public BigDecimal applyDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean canApplyDiscount(Budget budget) {
		return budget.getQuantity() >= 5;
	}

}
