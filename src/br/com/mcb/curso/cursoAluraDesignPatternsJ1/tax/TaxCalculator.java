package br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, TaxType taxType) {
		switch (taxType) {
			case ICMS:
				return budget.getValue().multiply(new BigDecimal("0.1"));
			case ISS:
				return budget.getValue().multiply(new BigDecimal("0.6"));
			default:
				return BigDecimal.ZERO;
		}
	}

}
