public class MoneyBreaker {
public static void main(String[] args) {
	int money = 2567;
	
	int hundreds = money/100;
	int moneyLeft = money%100;
	
	int fifties = moneyLeft/50;
	moneyLeft = moneyLeft%50;
	
	int twenties = moneyLeft/20;
	moneyLeft = moneyLeft%20;
	
	int tens = moneyLeft/10;
	moneyLeft = moneyLeft%10;
	
	}
}