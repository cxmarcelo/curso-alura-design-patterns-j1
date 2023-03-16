package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order;

import java.time.LocalDateTime;
import java.util.List;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action.ActionAfterGenerateOrder;

public class OrderGenerateHandler {

	//injeção de dependencias
	private List<ActionAfterGenerateOrder> actions;


	public OrderGenerateHandler(List<ActionAfterGenerateOrder> actions) {
		super();
		this.actions = actions;
	}

	public void execute(OrderGenerate orderGenerate) {
		Budget budget = new Budget(orderGenerate.getBudgetValue(), orderGenerate.getItemsQuantity());

		Order order = new Order(orderGenerate.getClient(), LocalDateTime.now(), budget);

		actions.forEach(action -> action.executeAction(order));
	}

}
