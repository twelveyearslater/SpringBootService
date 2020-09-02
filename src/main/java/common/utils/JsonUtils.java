package common.utils;

import javax.servlet.http.HttpServletResponse;

public class JsonUtils {
    public JsonUtils() {}

    public static String renderString(HttpServletResponse response, Object object) {
        return renderString(response, JsonMapper.toJsonString(object), "application/json");
    }

    public static String renderString(HttpServletResponse response, String string, String type) {
        try {
            response.setContentType(type);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
