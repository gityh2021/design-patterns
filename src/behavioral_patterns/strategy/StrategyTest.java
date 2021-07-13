package behavioral_patterns.strategy;

import behavioral_patterns.strategy.cash_strategy.Context;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/13
 * TIme: 14:41
 */
public class StrategyTest {
    public static void main(String[] args) {
        double money = 2021;
        Context my_context = new Context("Fullaeduction", money);
        System.out.println(my_context.getMoneyAfterDiscount());
    }

}
