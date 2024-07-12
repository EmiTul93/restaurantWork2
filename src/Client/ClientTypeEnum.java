package Client;

public enum ClientTypeEnum {
    VEGETARIANO ("VEGETARIANO"),
    CARNIVORO ("CARNIVORO"),

    VEGANO ("VEGANO");

    private final String description;
    ClientTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
