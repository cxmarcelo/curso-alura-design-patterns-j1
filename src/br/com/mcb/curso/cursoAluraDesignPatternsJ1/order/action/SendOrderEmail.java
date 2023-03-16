package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.Order;

public class SendOrderEmail implements ActionAfterGenerateOrder {

	public void executeAction(Order order) {
		System.out.println("Enviando email com dados do pedido.");
	}

}
