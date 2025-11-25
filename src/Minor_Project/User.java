package Minor_Project;

import java.util.Set;

public class User {
    private String name;
    private Set<String> roles;
    private boolean active;

  /*  public User(String name, Set<String> roles, boolean active) {
        this.name = name;
        this.roles = roles;
        this.active = active;
    } */

    public User(String name,boolean active, Set<String> roles) {
        this.name = name;

        this.active = active;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public boolean isActive() {
        return active;
    }

}
