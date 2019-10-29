package android.mmtech.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        // получить выбранныйй элемент из списка
        String beerType = String.valueOf(color.getSelectedItem());
        // получить рекомендации от класса BeerExpert
        List<String> brandsList = beerExpert.getBrands(beerType);

        // построить String по данным из List
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand:brandsList) {
            // каждій сорт выводится с новой строки
            brandsFormatted.append(brand).append("\n");
        }
        // вывести сорта пива
        brands.setText(brandsFormatted);

    }

}
