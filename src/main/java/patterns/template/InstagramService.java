package patterns.template;

public class InstagramService extends SocialNetworkService {

    @Override
    boolean verifyBadWords(final String message) {
        if(message.contains("bad-word")) {
            return true;
        }
        return false;
    }
}
