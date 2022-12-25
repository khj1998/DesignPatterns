package User;

import BroadcastPlatform.Platform;

public class UserImpl implements User{
    Platform usingPlatform;

    public UserImpl(Platform usingPlatform){
        this.usingPlatform = usingPlatform;
    }

    @Override
    public void LiveWatching(){
        usingPlatform.Live();
    }

    @Override
    public void RecordingWatching(){
        usingPlatform.Recording();
    }

    @Override
    public void Donate(){
        System.out.println("Donate By"+this.usingPlatform.GetDonateMethod());
    }
}
