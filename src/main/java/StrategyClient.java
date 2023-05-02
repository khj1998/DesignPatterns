import StrategyPattern.Bowman;
import StrategyPattern.Magician;
import StrategyPattern.StrategyContext;
import StrategyPattern.Warrior;

public class StrategyClient {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();

        strategyContext.setSkillStrategy(new Magician());
        strategyContext.UserSkill();

        strategyContext.setSkillStrategy(new Bowman());
        strategyContext.UserSkill();

        strategyContext.setSkillStrategy(new Warrior());
        strategyContext.UserSkill();
    }
}
