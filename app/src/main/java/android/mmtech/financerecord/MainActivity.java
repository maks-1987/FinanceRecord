package android.mmtech.financerecord;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int DIALOG_EXIT = 1;
    String testVariable = "Test";
    HomeFragment homeFragment;
    GrafikFragment grafikFragment;
    SettingsFragment settingsFragment;
    FragmentTransaction fragmentTransaction;
    Button btnHome;
    Button btnGrafik;
    Button btnSettings;
    View.OnClickListener myClickListener;

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

        // find elements & set listener
/*        findViewById(R.id.home_button).setOnClickListener(this);
        findViewById(R.id.grafik_button).setOnClickListener(this);
        findViewById(R.id.settings_button).setOnClickListener(this);*/

    }
    @Override
    public void onClick(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()) { // по id определяем кто вызвал обработчик
            case R.id.home_button:
                fragmentTransaction.replace(R.id.frame_content, homeFragment);
                break;
            case R.id.grafik_button:
                fragmentTransaction.replace(R.id.frame_content, grafikFragment);
                break;
            case R.id.settings_button:
                fragmentTransaction.replace(R.id.frame_content, settingsFragment);
                break;
            default:
                break;
        }
        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

/*    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_EXIT) {
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            // заголовок
            adb.setTitle("Exit of the App&");
            // сообщение
            //adb.setMessage(R.string.save_data);
            // иконка
            adb.setIcon(android.R.drawable.ic_dialog_info);
            // кнопка положительного ответа
            adb.setPositiveButton("Yes", myClickListener);
            // кнопка отрицательного ответа
            adb.setNegativeButton("No", myClickListener);
            // создаем диалог
            return adb.create();
        }
        return super.onCreateDialog(id);
    }*/

}
