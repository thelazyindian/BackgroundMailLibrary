package com.kristijandraca.contactlibrarydemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.kristijandraca.backgroundmaillibrary.BackgroundMail;

public class DemoActivity extends Activity {
	Context context;
	EditText to, subject, message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);

		context = this;

		to = (EditText) findViewById(R.id.et_to);
		subject = (EditText) findViewById(R.id.et_subject);
		message = (EditText) findViewById(R.id.et_message);

		Button bt_send = (Button) findViewById(R.id.bt_send);
		bt_send.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				BackgroundMail bm = new BackgroundMail(context);
				bm.setGmailUserName("your@gmail.com");
				bm.setGmailPassword("password");
				bm.setMailTo(to.getText().toString());
				bm.setFormSubject(subject.getText().toString());
				bm.setFormBody(message.getText().toString());
				// this is optional
				// bm.setSendingMessage("Uèitavanje...");
				// bm.setSendingMessageSuccess("Poruka je uspješno poslana.");
				// bm.setProcessVisibility(false);
				bm.send();

			}

		});
	}

}
