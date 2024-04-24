public class Main {
    public static void main(String[] args) {

        AuthenticationFactory usernamePasswordFactory = new UsernamePasswordAuthFactory();
        Authentication usernamePasswordAuth = usernamePasswordFactory.createAuthentication();
        usernamePasswordAuth.authenticate("user123", "password123");

        AuthenticationFactory oauthFactory = new OAuthAuthFactory();
        Authentication oauthAuth = oauthFactory.createAuthentication();
        oauthAuth.authenticate("user123", "password123");
    }
}
