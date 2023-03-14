package br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal applyDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean canApplyDiscount(Budget budget) {
		return true;
	}

}
