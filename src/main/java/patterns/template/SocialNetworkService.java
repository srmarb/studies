package patterns.template;

public abstract class SocialNetworkService {

    private String profile;
    private Integer followers;

    public String post(final String message){
        if(verifyBadWords(message)) {
            return "not done!";
        }

        return "done!";
    }

    abstract boolean verifyBadWords(final String message);

}
