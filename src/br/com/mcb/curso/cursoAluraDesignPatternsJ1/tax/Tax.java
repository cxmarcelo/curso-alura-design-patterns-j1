package br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public interface Tax {

	public BigDecimal calculate(Budget budget);

}
