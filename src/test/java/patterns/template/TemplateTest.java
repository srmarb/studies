package patterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest {

    @Test
    public void testPostTwitterWithBadWord() {
        TwitterService twitterService = new TwitterService();
        String responseTwitter = twitterService.post("teste with bad-word2");
        assertEquals("not done!", responseTwitter);
    }

    @Test
    public void testPostInstagramWithBadWord() {
        InstagramService instagramService = new InstagramService();
        String responseInstagram = instagramService.post("teste with bad-word");
        assertEquals("not done!", responseInstagram);
    }

    @Test
    public void testPostTwitterWithoutBadWord() {
        TwitterService twitterService = new TwitterService();
        String responseTwitter = twitterService.post("simple test");
        assertEquals("done!", responseTwitter);
    }

    @Test
    public void testPostInstagramWithoutBadWord() {
        InstagramService instagramService = new InstagramService();
        String responseInstagram = instagramService.post("simple test");
        assertEquals("done!", responseInstagram);
    }
}
