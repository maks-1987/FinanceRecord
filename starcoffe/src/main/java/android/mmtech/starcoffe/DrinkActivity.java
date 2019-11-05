package android.mmtech.starcoffe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // получить напиток из данніх интента
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId]; //использовать drinkId для получ подробн инфы
                                            // о напитке, выбранном пользователем
        // Заполнение названия напитка
        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        // Заполнить описание напитка
        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        // Заполнить изображение напитка
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
