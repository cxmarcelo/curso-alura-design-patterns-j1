package br.com.mcb.curso.cursoAluraDesignPatternsJ1.main;

import java.math.BigDecimal;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.OrderGenerate;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.OrderGenerateHandler;

public class TestOrder {

	public static void main(String[] args) {
		String client = args[0];
		BigDecimal budgetValue =  new BigDecimal(args[1]);
		Integer itemsQuantity = Integer.parseInt(args[2]);

		OrderGenerate orderGenerate = new OrderGenerate(client, budgetValue, itemsQuantity);
		OrderGenerateHandler handler = new OrderGenerateHandler(/* injections*/ );
		handler.execute(orderGenerate);
	}

}
