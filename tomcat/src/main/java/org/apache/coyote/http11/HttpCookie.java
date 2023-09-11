package org.apache.coyote.http11;

public class HttpCookie {

    public static final String JSESSIONID = "JSESSIONID";

    private final String name;
    private final String value;

    public HttpCookie(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static HttpCookie createSessionCookie(String sessionId) {
        return new HttpCookie(HttpCookie.JSESSIONID, sessionId);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
