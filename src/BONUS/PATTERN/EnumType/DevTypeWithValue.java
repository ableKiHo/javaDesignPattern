package BONUS.PATTERN.EnumType;

public enum DevTypeWithValue {
    MOBILE("안드로이드"), SERVER("리눅스"), WEB("스프링");

    final private String name;

    DevTypeWithValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
