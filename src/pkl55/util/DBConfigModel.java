package pkl55.util;

import java.io.Serializable;

public class DBConfigModel implements Serializable{
    private String loginUrl;
    private String logoutUrl;
    private String kue1Url;
    private String kue2Url;
    private String kue3Url;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getKue1Url() {
        return kue1Url;
    }

    public void setKue1Url(String kue1Url) {
        this.kue1Url = kue1Url;
    }

    public String getKue2Url() {
        return kue2Url;
    }

    public void setKue2Url(String kue2Url) {
        this.kue2Url = kue2Url;
    }

    public String getKue3Url() {
        return kue3Url;
    }

    public void setKue3Url(String kue3Url) {
        this.kue3Url = kue3Url;
    }

}
