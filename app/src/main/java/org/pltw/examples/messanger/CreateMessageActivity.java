package org.pltw.examples.messanger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    private Button sendButton;
    private EditText messageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        sendButton = (Button)findViewById(R.id.sendButton);
        messageTextView = (EditText) findViewById(R.id.messageTextView);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageText = messageTextView.getText().toString();
                //Intent intent = new Intent(view.getContext(), RecieveMessageActivity.class);
               // intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, messageText);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, messageText);
                String chooserTitle = getString(R.string.chooser);
                Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
                //startActivity(intent);
                startActivity(chosenIntent);


            }
        });

    }
}
