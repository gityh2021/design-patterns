package behavioral_patterns.strategy.cash_strategy;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/13
 * TIme: 15:02
 */
public class Context {
    Strategy strategy = null;
    // 初始化strategy
    public Context(String algorithm, double money){
        switch (algorithm) {
            case "FullDeduction":
                strategy = new StrategyFullReduction();
                break;
            case "Discount":
                strategy = new StrategyDiscount();
                break;
            default:
                System.out.println("请输入已有策略");
                break;
        }
        if (strategy != null)
            strategy.setMoney(money);
    }
    // 获取最终折扣后的金额
    public double getMoneyAfterDiscount(){
        if (strategy == null){
            return 0;
        }
        return strategy.getMoneyAfterDiscount();
    }
}
