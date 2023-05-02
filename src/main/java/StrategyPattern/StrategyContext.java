package StrategyPattern;

public class StrategyContext {
    private SkillStrategy skillStrategy;

    public void setSkillStrategy(SkillStrategy skillStrategy) {
        this.skillStrategy = skillStrategy;
    }

    public void UserSkill() {
        if (skillStrategy==null) {
            throw new IllegalStateException("전략이 설정되지 않았습니다.");
        }
        this.skillStrategy.UseSkill();
        System.out.println("\n");
    }
}
