package prototype;

public class Tools {
    public static void copy(UserInfo userInfo , UserInfoTemp userInfoTemp){
        userInfo.setUserNo(userInfoTemp.getUserNo());
        userInfo.setName(userInfoTemp.getName());
        userInfo.setPwd(userInfoTemp.getPwd());
        userInfo.setUserLevel(userInfoTemp.getUserLevel());
        userInfo.setTel(userInfoTemp.getTel());
        userInfo.setEmail(userInfoTemp.getEmail());
        userInfo.setOnlineStatus(userInfoTemp.getOnlineStatus());
        userInfo.setFlag(userInfoTemp.getFlag());
        userInfo.setStrUserMenu(userInfoTemp.getStrUserMenu());
        userInfo.setLoginDate(userInfoTemp.getLoginDate());
        userInfo.setBusiStatus(userInfoTemp.getBusiStatus());
        userInfo.setDepartNo(userInfoTemp.getDepartNo());
        userInfo.setCreateBy(userInfoTemp.getCreateBy());
        userInfo.setCreateDt(userInfoTemp.getCreateDt());
    }
}
