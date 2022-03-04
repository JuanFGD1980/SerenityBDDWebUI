package co.com.sofka.utils;

public enum SubjectHeading {

    CUSTOMER("Customer service"),
    WEBMASTER("Webmaster");

    private final String value;

    public String getValue() {
        return value;
    }

    SubjectHeading(String value) {
        this.value = value;
    }
}
