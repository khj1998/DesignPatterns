package BroadcastPlatform;

public class YoutubePlatformImpl implements Platform{

    private String DonateMethod = null;

    public YoutubePlatformImpl(){
        SetDonateMethod();
    }

    @Override
    public void SetDonateMethod(){
        this.DonateMethod = "SuperChat";
    }

    @Override
    public String GetDonateMethod(){
        return this.DonateMethod;
    }

    @Override
    public void Live(){
        System.out.println("Watching Live in Platform Platform");
    }

    @Override
    public void Recording() {
        System.out.println("Watching Recording in Youtube Platform");
    }
}
