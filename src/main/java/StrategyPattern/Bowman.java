package StrategyPattern;

public class Bowman implements SkillStrategy {
    @Override
    public void UseSkill() {
        System.out.println("Bowman : Using ArrowBoom!!");
    }
}
