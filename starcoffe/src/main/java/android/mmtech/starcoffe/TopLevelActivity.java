package android.mmtech.starcoffe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
                    Intent intent = new Intent(TopLevelActivity.this, Drink.class);
                    startActivity(intent);
                }
            }
        };
        // Теперь назначить созданный Слушатель для ListView
        ListView listView = (ListView) findViewById(R.id.list_option);
        listView.setOnItemClickListener(itemClickListener);

    }
}
