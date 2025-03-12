public class HaveUserName implements SpopState {

    public HaveUserName(String userName) {
        System.out.println("User: " + userName);
    }

    @Override
    public boolean pass(String password) {
        return validate(password);

    }

    private boolean validate(String password) {
        // check password for <userName>
        if (password.equals("open sesame!")) {
            System.out.println("User validated!");
            return true;
        }
        return false;
    }

}
