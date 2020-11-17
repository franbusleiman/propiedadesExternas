package franciscobuslieman.propiedadesExternas.propiedadesExternas;

public class UserPassword {

    private String user;
    private String password;
    public UserPassword(){}

    public UserPassword(String user, String password){
        this.user = user;
        this.password = password;
    }

    public String getUser(){
        return this.user;
    }
    public void setUser(String user){
        this.user = user;
    }

    public String getPassword(){
        return this.password;

    }

    public void setPassword(String password){
        this.password = password;
    }
}
