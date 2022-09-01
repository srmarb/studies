package patterns.template;

public class TwitterService extends SocialNetworkService {

    @Override
    boolean verifyBadWords(final String message) {
        if(message.contains("bad-word2")) {
            return true;
        }
        return false;
    }
}
