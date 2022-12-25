package BroadcastPlatform;

public class TwichPlatformImpl implements Platform{

    private String DonateMethod = null;

    public TwichPlatformImpl(){
        SetDonateMethod();
    }

    @Override
    public void SetDonateMethod(){
        this.DonateMethod = "Twonation";
    }

    @Override
    public String GetDonateMethod(){
        return this.DonateMethod;
    }

    @Override
    public void Live() {
        System.out.println("Watching Live in Twitch Platform");
    }

    @Override
    public void Recording() {
        System.out.println("Watching Recording in Twitch Platform");
    }
}
