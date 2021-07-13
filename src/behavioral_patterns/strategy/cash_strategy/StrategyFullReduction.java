package behavioral_patterns.strategy.cash_strategy;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/13
 * TIme: 15:06
 */
public class StrategyFullReduction extends Strategy{

    @Override
    public double getMoneyAfterDiscount() {
        System.out.println("满200减50");
        double current_money = this.getMoney();
        double reduction_money = 0;
        while(current_money >= 200){
            current_money -= 200;
            reduction_money += 50;
        }

        return this.getMoney() - reduction_money;
    }
}
