package org.pltw.examples.messanger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class RecieveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    private EditText messageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        messageTextView = (EditText) findViewById(R.id.messageTextView);
        messageTextView.setText(messageText);
    }
}
