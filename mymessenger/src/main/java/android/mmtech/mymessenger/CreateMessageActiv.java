package android.mmtech.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActiv extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText editMessage = findViewById(R.id.message);
        String messageText = editMessage.getText().toString(); // получить введенный текст <EditText>

        Intent intent = new Intent(Intent.ACTION_SEND); // вызовет все активности, что могут делать отправку (SEND)
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText); // вложим в интент сообщение, котор получено из <EditText>

        String chooserTitle = getString(R.string.chooser); // getString - для получения строковых ресурсов
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle); // создать окно выбора из списка возмож приложений
                                                                        // и добав Заглавие в предыдущем интенте (intent)
        startActivity(chosenIntent);

    }
}

