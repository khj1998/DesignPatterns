package StrategyPattern;

public class Magician implements SkillStrategy {
    @Override
    public void UseSkill() {
        System.out.println("Magician : Using Magic Claw!!");
    }
}
