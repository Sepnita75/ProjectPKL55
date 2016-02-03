package pkl55.model;


public class LoginPanelModel {
    
    private boolean frontMenuFlag = false;
    private boolean loginStatus;
    
    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean flag) {
        this.loginStatus = flag;
    }

    public boolean isFlag() {
        return frontMenuFlag;
    }

    public void setFlag(boolean flag) {
        this.frontMenuFlag = flag;
    }

}
