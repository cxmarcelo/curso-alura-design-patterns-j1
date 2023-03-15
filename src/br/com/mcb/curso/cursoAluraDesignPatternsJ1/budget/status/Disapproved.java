package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class Disapproved extends BudgetStatus {

	@Override
	public void finalizeBudget(Budget budget) {
		budget.setStatus(new Finished());
	}

}
