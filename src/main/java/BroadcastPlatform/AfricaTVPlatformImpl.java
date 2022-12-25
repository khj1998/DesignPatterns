package BroadcastPlatform;

public class AfricaTVPlatformImpl implements Platform{

    private String DonateMethod = null;

    public AfricaTVPlatformImpl(){
        SetDonateMethod();
    }

    @Override
    public void SetDonateMethod(){
        this.DonateMethod = "StarBallon";
    }

    @Override
    public String GetDonateMethod(){
        return this.DonateMethod;
    }

    @Override
    public void Live() {
        System.out.println("Watching Live in Youtube Platform");
    }

    @Override
    public void Recording() {
        System.out.println("Watching Recording in Youtube Platform");
    }
}
