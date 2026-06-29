public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money=1000;
    }

    public double eatAffordably(double payment) {
        if(payment<2.5){
            return payment;
        }
        money+=2.5;
        affordableMeals++;
        return payment-2.5;
    }

    public double eatHeartily(double payment) {
        if(payment<4.3){
            return payment;
        }
        heartyMeals++;
        money+=4.3;
        return payment-4.3;
    }
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance()>=2.5){
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }
        return false;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance()>=4.30){
            heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
        return false;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
