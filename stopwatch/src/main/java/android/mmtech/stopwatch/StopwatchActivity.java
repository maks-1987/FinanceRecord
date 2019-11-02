package android.mmtech.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning; // хранит инфу - работал ли секундомер перед вызовом onStart()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if (savedInstanceState != null) { // получить значение из Bundle после остановки приложения
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            // восстанавл состояние переменной, если актин создается заново
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

    @Override // сохранить знач перемен в Bundle, для восстановлен при повороте экрана и т.д.
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    public void onClickStart(View view) {
        running = true; // start stopwatch
    }

    public void onClickStop(View view) {
        running = false; // stop stopwatch
    }

    public void onClickReset(View view) {
        running = false; // проверяет работает ли секундмер?
        seconds = 0;
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running; // да, секундомер работал во время остановки активности
        running = false; // секундомер остановится при остановке активности
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) { // если секундомер работал, то отсчет продолжится
            running = true;
        }
    }

    private void runTimer() {
        final TextView timeView = findViewById(R.id.time_view);
        final Handler handler = new Handler();
        // Handler позволит запускать второй поток выполнения внутри приложения
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                // форматирование времени
                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);

                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}
