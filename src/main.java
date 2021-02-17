import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                sendTweet();
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000 * 60 * 60 * 3);



    }

    public static String bodyParts(String head, String body, String legs, String feet) {
        return head + "\r\n" + body + "\r\n" + legs + "\r\n" + feet;
    }

    public static void sendTweet() {

        String head[] = {"\ud83d\ude00", "\ud83d\ude03", "\ud83d\ude04", "\ud83d\ude01", "\ud83d\ude06", "\ud83d\ude05", "\ud83d\ude02", "\ud83e\udd23", "\ud83d\ude0a", "\ud83d\ude07", "\ud83d\ude42", "\ud83d\ude43", "\ud83d\ude09", "\ud83d\ude0c", "\ud83d\ude0d", "\ud83e\udd70", "\ud83d\ude18", "\ud83d\ude17", "\ud83d\ude19", "\ud83d\ude1a", "\ud83d\ude0b", "\ud83d\ude1b", "\ud83d\ude1d", "\ud83d\ude1c", "\ud83e\udd2a", "\ud83e\udd28", "\ud83e\uddd0", "\ud83e\udd13", "\ud83d\ude0e", "\ud83e\udd29", "\ud83e\udd73", "\ud83d\ude0f", "\ud83d\ude12", "\ud83d\ude1e", "\ud83d\ude14", "\ud83d\ude1f", "\ud83d\ude15", "\ud83d\ude41", "\ud83d\ude23", "\ud83d\ude16", "\ud83d\ude2b", "\ud83d\ude29", "\ud83e\udd7a", "\ud83d\ude22", "\ud83d\ude2d", "\ud83d\ude24", "\ud83d\ude20", "\ud83d\ude21", "\ud83e\udd2c", "\ud83e\udd2f", "\ud83d\ude33", "\ud83e\udd75", "\ud83e\udd76", "\ud83d\ude31", "\ud83d\ude28", "\ud83d\ude30", "\ud83d\ude25", "\ud83d\ude13", "\ud83e\udd17", "\ud83e\udd14", "\ud83e\udd2d", "\ud83e\udd2b", "\ud83e\udd25", "\ud83d\ude36", "\ud83d\ude10", "\ud83d\ude11", "\ud83d\ude2c", "\ud83d\ude44", "\ud83d\ude2f", "\ud83d\ude26", "\ud83d\ude27", "\ud83d\ude2e", "\ud83d\ude32", "\ud83e\udd71", "\ud83d\ude34", "\ud83e\udd24", "\ud83d\ude2a", "\ud83d\ude35", "\ud83e\udd10", "\ud83e\udd74", "\ud83e\udd22", "\ud83e\udd2e", "\ud83e\udd27", "\ud83d\ude37", "\ud83e\udd12", "\ud83e\udd15", "\ud83e\udd11", "\ud83e\udd20", "\ud83d\ude08", "\ud83d\udc7f", "\ud83d\udc79", "\ud83d\udc7a", "\ud83e\udd21", "\ud83d\udc76", "\ud83e\uddd2", "\ud83d\udc66", "\ud83d\udc67", "\ud83e\uddd1", "\ud83d\udc71", "\ud83d\udc68", "\ud83e\uddd4", "\ud83d\udc68\u200d\ud83e\uddb0", "\ud83d\udc68\u200d\ud83e\uddb1", "\ud83d\udc68\u200d\ud83e\uddb3", "\ud83d\udc68\u200d\ud83e\uddb2", "\ud83d\udc69", "\ud83d\udc69\u200d\ud83e\uddb0", "\ud83e\uddd1\u200d", "\ud83d\udc69\u200d\ud83e\uddb1", "\ud83e\uddd1\u200d", "\ud83d\udc69\u200d\ud83e\uddb3", "\ud83e\uddd1\u200d", "\ud83d\udc69\u200d\ud83e\uddb2", "\ud83e\uddd1\u200d", "\ud83d\udc71\u200d♀️", "\ud83d\udc71\u200d♂️", "\ud83e\uddd3", "\ud83d\udc74", "\ud83d\udc75"};
        String body[] = {"\uD83E\uDD7C","\uD83E\uDDBA", "\uD83D\uDC54", "\uD83D\uDC55", "\uD83E\uDDE5", "\uD83D\uDC57", "\uD83D\uDC58", "\uD83E\uDD7B", "\uD83D\uDC5A"};
        String legs[] = {"\uD83E\uDE72", "\uD83E\uDE73", "\uD83D\uDC56"};
        String feet[] = {"\uD83E\uDDE6","\uD83D\uDC5E", "\uD83D\uDC5F","\uD83E\uDD7E", "\uD83E\uDD7F", "\uD83D\uDC60", "\uD83D\uDC61", "\uD83E\uDE70", "\uD83D\uDC62"};

        Random rng = new Random();
        int headRNG = rng.nextInt(head.length);
        int bodyRNG = rng.nextInt(body.length);
        int legsRNG = rng.nextInt(legs.length);
        int feetRNG = rng.nextInt(feet.length);

        Twitter twitter = TwitterFactory.getSingleton();
        try {
            Status status = twitter.updateStatus(bodyParts(head[headRNG], body[bodyRNG], legs[legsRNG], feet[feetRNG]));
        }
        catch(TwitterException e) {
            e.printStackTrace();
        }
        System.out.println("it worked");
    }

}
