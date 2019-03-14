package prototype;

import java.util.Date;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfoTemp userInfoTemp = new UserInfoTemp();
        userInfoTemp.setUserNo("No1");
        userInfoTemp.setName("张三");
        userInfoTemp.setPwd("123456");
        userInfoTemp.setUserLevel("1");
        userInfoTemp.setTel("17828910823");
        userInfoTemp.setEmail("123@163.com");
        userInfoTemp.setOnlineStatus(1L);
        userInfoTemp.setFlag(1L);
        userInfoTemp.setStrUserMenu("2345");
        userInfoTemp.setLoginDate(new Date().toString());
        userInfoTemp.setBusiStatus("PS010");
        userInfoTemp.setDepartNo("01");
        userInfoTemp.setCreateBy("create001");
        userInfoTemp.setCreateDt(new Date());

        UserInfo userInfo = (UserInfo)userInfoTemp.copy();
        System.out.println(userInfo);

        /*

        UserInfo userInfo = new UserInfo();
        Tools.copy(userInfo , userInfoTemp);
        System.out.println(userInfo.getBusiStatus());*/
    }


}
