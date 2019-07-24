Feature: Calculator Application
	Scenario: Invoking addition
		Given A REST url as "http://localhost:8080/addition?firstOperand=10&secondOperand=10"
		When invoking REST API for addition
		Then expected result is "20"
