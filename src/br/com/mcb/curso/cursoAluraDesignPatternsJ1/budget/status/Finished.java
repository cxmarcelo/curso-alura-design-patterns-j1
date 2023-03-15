package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class Finished extends BudgetStatus {

	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

}
