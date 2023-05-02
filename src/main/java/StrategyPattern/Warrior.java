package StrategyPattern;

public class Warrior implements SkillStrategy {
    @Override
    public void UseSkill() {
        System.out.println("Warrior : Using PowerStrike!!");
    }
}
