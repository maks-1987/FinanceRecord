package android.mmtech.starcoffe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        // Создать слушателя для ListView
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

                if (position == 0) { // Создать интент для запуска требуемой активности
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Food not working", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (position == 2) {
                    Toast toast = Toast.makeText(getBaseContext(), "Stores not working", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        };
        // Теперь назначить созданный Слушатель для ListView
        ListView listView = findViewById(R.id.list_option);
        listView.setOnItemClickListener(itemClickListener);

    }


}
