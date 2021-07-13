package behavioral_patterns.strategy.cash_strategy;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/13
 * TIme: 14:59
 */
public abstract class Strategy {
    private double money = 0d;
    public double getMoneyAfterDiscount() {
        return 0d;
    }
    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
