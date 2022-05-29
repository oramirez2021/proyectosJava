package com.example.demo;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
class DemoApplicationTests {
	Calculator calculadora = new Calculator();
	@Test
	void itShouldAddTwoNumbers() {
		//given
		int numberOne = 10;
		int numberTwo = 20;
		//when
		int result = calculadora.add(numberOne,numberTwo);
		//then
		Assertions.assertEquals(result,30);
	}

}
class Calculator{
	int add(int a, int b){
		return a+b;
	}
}