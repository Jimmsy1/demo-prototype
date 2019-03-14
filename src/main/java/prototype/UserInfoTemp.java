package prototype;

import java.util.Date;

public class UserInfoTemp implements Prototype{
    // Fields
    private String userNo;
    private String name;
    private String pwd;
    private String userLevel;
    private String tel;
    private String email;
    private Long onlineStatus;
    private Long flag;
    private String strUserMenu ;
    private String loginDate;
    private String busiStatus;
    private String departNo;
    private String createBy;
    private Date createDt;
    private String updateBy;
    private Date updateDt;
    private String lastLoginIp;
    private Date updatePwdDt;

    public UserInfoTemp(String userNo, String name, String pwd, String userLevel, String tel, String email, Long onlineStatus, Long flag, String strUserMenu, String loginDate, String busiStatus, String departNo, String createBy, Date createDt, String updateBy, Date updateDt, String lastLoginIp, Date updatePwdDt) {
        this.userNo = userNo;
        this.name = name;
        this.pwd = pwd;
        this.userLevel = userLevel;
        this.tel = tel;
        this.email = email;
        this.onlineStatus = onlineStatus;
        this.flag = flag;
        this.strUserMenu = strUserMenu;
        this.loginDate = loginDate;
        this.busiStatus = busiStatus;
        this.departNo = departNo;
        this.createBy = createBy;
        this.createDt = createDt;
        this.updateBy = updateBy;
        this.updateDt = updateDt;
        this.lastLoginIp = lastLoginIp;
        this.updatePwdDt = updatePwdDt;
    }

    public UserInfoTemp() {

    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Long onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public String getStrUserMenu() {
        return strUserMenu;
    }

    public void setStrUserMenu(String strUserMenu) {
        this.strUserMenu = strUserMenu;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getBusiStatus() {
        return busiStatus;
    }

    public void setBusiStatus(String busiStatus) {
        this.busiStatus = busiStatus;
    }

    public String getDepartNo() {
        return departNo;
    }

    public void setDepartNo(String departNo) {
        this.departNo = departNo;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getUpdatePwdDt() {
        return updatePwdDt;
    }

    public void setUpdatePwdDt(Date updatePwdDt) {
        this.updatePwdDt = updatePwdDt;
    }

    public Prototype copy() {
        UserInfo userInfo =  new UserInfo();
        userInfo.setUserNo(this.userNo);
        userInfo.setName(this.name);
        userInfo.setPwd(this.pwd);
        userInfo.setUserLevel(this.userLevel);
        userInfo.setTel(this.tel);
        userInfo.setEmail(this.email);
        userInfo.setOnlineStatus(this.onlineStatus);
        userInfo.setFlag(this.flag);
        userInfo.setStrUserMenu(this.strUserMenu);
        userInfo.setLoginDate(this.loginDate);
        userInfo.setBusiStatus(this.busiStatus);
        userInfo.setDepartNo(this.departNo);
        userInfo.setCreateBy(this.createBy);
        userInfo.setCreateDt(this.createDt);
        return userInfo;
    }
}
