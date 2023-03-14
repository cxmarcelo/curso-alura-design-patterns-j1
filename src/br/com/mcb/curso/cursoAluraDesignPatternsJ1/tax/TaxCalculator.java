package br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}
	
}
