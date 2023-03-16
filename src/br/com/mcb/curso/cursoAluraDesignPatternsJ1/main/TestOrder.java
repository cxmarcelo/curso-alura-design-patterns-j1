package br.com.mcb.curso.cursoAluraDesignPatternsJ1.main;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.OrderGenerate;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.OrderGenerateHandler;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action.SaveOrderInDataBase;
import br.com.mcb.curso.cursoAluraDesignPatternsJ1.order.action.SendOrderEmail;

public class TestOrder {

	public static void main(String[] args) {
		String client = "João";
		BigDecimal budgetValue =  new BigDecimal("450");
		Integer itemsQuantity = 3;

		OrderGenerate orderGenerate = new OrderGenerate(client, budgetValue, itemsQuantity);
		OrderGenerateHandler handler = new OrderGenerateHandler(Arrays.asList(new SaveOrderInDataBase(), new SendOrderEmail()));
		handler.execute(orderGenerate);
	}
	

}
