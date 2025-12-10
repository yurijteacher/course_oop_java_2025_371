package ua.com.kisit.unit10.structural_patterns.adapter.v1;


public class UserAdapter extends Client implements UserDetails {

    @Override
    public String getUser() {
        return getUsername();
    }

    @Override
    public String getPass() {
        return getPassword();
    }
}
