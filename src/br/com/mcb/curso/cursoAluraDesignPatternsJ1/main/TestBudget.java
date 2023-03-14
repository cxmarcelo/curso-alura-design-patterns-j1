package br.com.mcb.curso.cursoAluraDesignPatternsJ1.main;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax.TaxCalculator;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax.TaxType;

public class TestBudget {

	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal(100));
		TaxCalculator taxCalculator = new TaxCalculator();
		
		BigDecimal tax = taxCalculator.calculate(budget, TaxType.ICMS);
		System.out.println("tax: " + tax);
	}

}
