public class UsernamePasswordAuthentication implements Authentication {

    @Override
    public void authenticate(String username, String password) {
        System.out.println("Authenticating with username and password...");
    }
}

