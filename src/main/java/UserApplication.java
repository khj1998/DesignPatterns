import BroadcastPlatform.AfricaTVPlatformImpl;
import BroadcastPlatform.TwichPlatformImpl;
import BroadcastPlatform.YoutubePlatformImpl;
import User.User;
import User.UserImpl;

public class UserApplication {
    public static void main(String[] args){

        User TwitchUser= new UserImpl(new TwichPlatformImpl());
        User YoutubeUser = new UserImpl(new YoutubePlatformImpl());
        User AfricaTvUser = new UserImpl(new AfricaTVPlatformImpl());
        User FreeUser = new UserImpl(new AfricaTVPlatformImpl());

        TwitchUser.LiveWatching();
        YoutubeUser.LiveWatching();
        AfricaTvUser.LiveWatching();
        System.out.println("\n\n");

        TwitchUser.Donate();
        YoutubeUser.Donate();
        AfricaTvUser.Donate();
        System.out.println("\n\n");

        FreeUser.RecordingWatching();
        FreeUser.Donate();
    }
}
