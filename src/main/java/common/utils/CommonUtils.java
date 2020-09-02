package common.utils;

import javax.servlet.http.HttpServletResponse;

public class CommonUtils {

    // JSON格式化
    public static String printDataJson(HttpServletResponse response, Object item) {
        try {
            JsonUtils.renderString(response, item);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 随机生成6位随机验证码
    public static String createRandomVCode(int len) {
        // 验证码
        String vCode = "";
        for (int i = 0; i < len; i++) {
            vCode += (int) (Math.random() * 9);
        }
        return vCode;
    }
}
