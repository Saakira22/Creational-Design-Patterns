public class OAuthAuthFactory implements AuthenticationFactory {
    
    @Override
    public Authentication createAuthentication() {
        return new OAuthAuthentication();
    }
}
