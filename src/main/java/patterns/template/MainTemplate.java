package patterns.template;

public class MainTemplate {

    public static void main(String[] args) {
        InstagramService instagramService = new InstagramService();
        TwitterService twitterService = new TwitterService();
        String responseInstagram = instagramService.post("teste with bad-word");
        String responseTwitter = twitterService.post("teste with bad-word2");
        System.out.println("Instagram: " + responseInstagram);
        System.out.println("Twitter: " + responseTwitter);
    }

}
