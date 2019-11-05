package android.mmtech.starcoffe;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // массив напитков
    static final Drink[] drinks = {
            new Drink("Latte", "A couple whith milk", R.drawable.latte),
            new Drink("Capuccino", "Espresso hot milk", R.drawable.cappuccino),
            new Drink("Filter", "Highest and fresh", R.drawable.filter)
    };

    // Конструктор напитков
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    @Override // в качестве строкового представления Drink, используется название напитка
    public String toString() {
        return this.name;
    }
}
