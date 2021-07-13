package behavioral_patterns.strategy.cash_strategy;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/13
 * TIme: 15:03
 */
public class StrategyDiscount extends Strategy{
    @Override
    public double getMoneyAfterDiscount() {
        System.out.println("打8折");
        return this.getMoney() * 0.8;
    }
}
