package android.mmtech.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActiv extends Activity {

    public static final String EXTRA_MESSAGE = "message!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textMessageView = (TextView)findViewById(R.id.message);
        textMessageView.setText(msg);
    }
}
