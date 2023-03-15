package br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status.BudgetStatus;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.status.InAnalysis;

public class Budget {

	private BigDecimal value;
	private Integer quantity;
	private BudgetStatus status;


	public Budget(BigDecimal value, Integer quantity) {
		super();
		this.value = value;
		this.quantity = quantity;
		this.status = new InAnalysis();
	}
	
	public void applyExtraDiscount() {
		BigDecimal extraDiscount = this.status.calculateExtraDiscount(this);
		this.value = this.value.subtract(extraDiscount);
	}

	public void toApprove() {
		this.status.toApprove(this);
	}
	
	public void reprove() {
		this.status.toApprove(this);
	}
	
	public void finalizeBudget() {
		this.status.finalizeBudget(this);
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public BudgetStatus getStatus() {
		return status;
	}

	public void setStatus(BudgetStatus status) {
		this.status = status;
	}

}
