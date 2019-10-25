package android.mmtech.financerecord;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String testVariable = "Test";
    HomeFragment homeFragment;
    GrafikFragment grafikFragment;
    SettingsFragment settingsFragment;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add spinner - choice peroid
        Spinner spinner = findViewById(R.id.spinner_choicePeriod); // Создаем ArrayAdapter, используя массив строк и макет спиннера по умолчанию
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_choicePeriod, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Указали макет, котор буд использ-ся при появлен списка вар-тов
        spinner.setAdapter(adapter); // Приложм адаптер к счетчику

        homeFragment = new HomeFragment();
        grafikFragment = new GrafikFragment();
        settingsFragment = new SettingsFragment();


    }

    public void onClick(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.home_button:
                fragmentTransaction.add(R.id.frame_content, homeFragment);
                break;
            case R.id.grafik_button:
                fragmentTransaction.add(R.id.frame_content, grafikFragment);
                break;
            case R.id.settings_button:
                fragmentTransaction.add(R.id.frame_content, settingsFragment);
                break;
            default:
                break;
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



}