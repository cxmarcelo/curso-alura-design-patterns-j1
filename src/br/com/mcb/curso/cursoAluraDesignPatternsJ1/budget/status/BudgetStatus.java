package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public abstract class BudgetStatus {
	
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}

	public void toApprove(Budget budget) {
		throw new RuntimeException("Orçamento não pode ser aprovado!");
	}
	
	public void reprove(Budget budget) {
		throw new RuntimeException("Orçamento não pode ser reprovado!");
	}
	
	public void finalizeBudget(Budget budget) {
		throw new RuntimeException("Orçamento não pode ser finalizado!");
	}
}
