package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class InAnalysis extends BudgetStatus {

	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void toApprove(Budget budget) {
		budget.setStatus(new Approved());
	}
	
	@Override
	public void reprove(Budget budget) {
		budget.setStatus(new Disapproved());
	}
	
}
