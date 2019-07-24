Feature: Calculator addition
	Scenario:Addition
		Given A REST url as "http://localhost:9400/addition?firstOperand=10&secondOperand=10"
		When Invoking addition with two Operand
		Then expected result is 10
