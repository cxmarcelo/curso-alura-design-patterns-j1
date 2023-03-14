package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {
		Discount discount = new DiscountByItems(new DiscountByPrice(new NoDiscount()));
		
		return discount.calculate(budget);
	}

}
