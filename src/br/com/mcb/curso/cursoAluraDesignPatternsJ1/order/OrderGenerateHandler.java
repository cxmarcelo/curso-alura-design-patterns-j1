package br.com.mcb.curso.cursoAluraDesignPatternsJ1.order;

import java.time.LocalDateTime;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.budget.Budget;

public class OrderGenerateHandler {

	//injeção de dependencias

	public void execute(OrderGenerate orderGenerate) {
		Budget budget = new Budget(orderGenerate.getBudgetValue(), orderGenerate.getItemsQuantity());

		Order order = new Order(orderGenerate.getClient(), LocalDateTime.now(), budget);

		System.out.println("Salvar pedido no Banco de Dados");
		System.out.println("Enviar email com dados do pedido");

	}

}
