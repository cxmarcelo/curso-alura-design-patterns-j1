package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.Order;

public interface ActionAfterGenerateOrder {

	public void executeAction(Order order);

}
