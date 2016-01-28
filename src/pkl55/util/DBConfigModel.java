package pkl55.util;

import java.io.Serializable;

public class DBConfigModel implements Serializable{
    private String Url;
    private String user;
//    private String password;
//    private String port;
//    private String dbName;
    

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    } 
}
