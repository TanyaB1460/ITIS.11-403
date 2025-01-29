package lab13_Enum;

public enum Hair {
    Ginger("Рыжий"),
    Black("Черный"),
    Yellow("Желтый");

    public String color;
    public long rgb;

    Hair() {
    }

    Hair(String color) {
        this.color = color;
    }
}