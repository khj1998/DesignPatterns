package templatemethod;

public class Pitcher2 extends TemplateMethodClass {
    @Override
    boolean isPitchingValid() {
        System.out.println("투수2 투구 동작이 유효합니까?");
        return true;
    }

    @Override
    boolean isWindUpEnd() {
        System.out.println("투수2 와인드업 동작!");
        return true;
    }

    @Override
    void FollowThrough() {
        System.out.println("투수2가 변화구를 던졌습니다!");
    }
}
