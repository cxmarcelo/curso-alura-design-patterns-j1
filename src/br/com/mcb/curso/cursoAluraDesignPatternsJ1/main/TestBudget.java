package br.com.mcb.curso.cursoAluraDesignPatternsJ1.main;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax.ICMS;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.tax.TaxCalculator;

public class TestBudget {

	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal(100), 1);
		TaxCalculator taxCalculator = new TaxCalculator();
		
		BigDecimal tax = taxCalculator.calculate(budget, new ICMS());
		System.out.println("tax: " + tax);
	}

}
