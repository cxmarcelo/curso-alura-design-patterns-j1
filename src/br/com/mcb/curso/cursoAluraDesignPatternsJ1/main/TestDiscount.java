package br.com.mcb.curso.cursoAluraDesignPatternsJ1.main;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.discount.DiscountCalculator;

public class TestDiscount {

	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal(200), 5);
		Budget budget2 = new Budget(new BigDecimal(1000), 1);
		DiscountCalculator taxCalculator = new DiscountCalculator();
		
		BigDecimal tax = taxCalculator.calculate(budget);
		BigDecimal tax2 = taxCalculator.calculate(budget2);
		System.out.println("discount: " + tax);
		System.out.println("discount2: " + tax2);
	}

}
