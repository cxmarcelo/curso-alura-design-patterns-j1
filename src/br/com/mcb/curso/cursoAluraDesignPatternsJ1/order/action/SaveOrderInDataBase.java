package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.Order;

public class SaveOrderInDataBase implements ActionAfterGenerateOrder {

	public void executeAction(Order order) {
		System.out.println("Salvando pedido no banco de dados.");
	}

}
