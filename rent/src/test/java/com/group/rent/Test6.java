package com.group.rent;

/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.*;

public class Test6 {

	@org.junit.Test
	public void test() {
		/**
		 * Входными данными является метод, производящий расчета квартплаты и
		 * предполагаемый результат данного расчета
		 */
		Calc a = new Calc(15, 77, 87, 33, 92, 39, 43, 31, 1, 22, 16, 19, 52);
		a.Calculate();
		/**
		 * Сравнение результата и ожидаемого значения
		 */
		assertEquals(String.valueOf(a.getitog()), "08810.0");
	}
}
