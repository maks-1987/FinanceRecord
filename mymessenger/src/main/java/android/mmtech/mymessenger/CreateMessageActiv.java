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
        String messageText = editMessage.getText().toString();
        //Intent intent = new Intent(this, ReceiveMessageActiv.class);
        //intent.putExtra(ReceiveMessageActiv.EXTRA_MESSAGE, messageText);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);

    }
}

