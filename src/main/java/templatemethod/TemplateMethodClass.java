package templatemethod;

public abstract class TemplateMethodClass {

    public final void Pitching() {
        if (!isWindUpEnd()) {
            System.out.println("와인드업을 취소하였습니다.");
            return;
        }

        Cocking();
        Acceleration();
        Deceleration();

        if (!isPitchingValid()) {
            System.out.println("보크!!");
            return;
        }

        FollowThrough();
    }

    private void Cocking() {
        System.out.println("코킹 동작!");
    }

    private void Acceleration() {
        System.out.println("가속기 동작!");
    }

    private  void Deceleration() {
        System.out.println("감속기 동작!");
    }

    boolean isPitchingValid() {
        return true;
    }

    boolean isWindUpEnd() {
        return false;
    }

    abstract void FollowThrough();
}
