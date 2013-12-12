package com.kristijandraca.contactlibrarydemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.kristijandraca.contactlibrarydemo.R;

public class DemoActivity extends Activity {
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);

		context = this;

		Button bt_contact = (Button) findViewById(R.id.bt_contact);
		bt_contact.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * BackgroundMail bm = new BackgroundMail(context);
				 * bm.setGmailUserName("gusti.app@gmail.com");
				 * bm.setGmailPassword("Ss<#K64~$.xA]4t");
				 * bm.setMailTo("kristijandraca@gmail.com");
				 * bm.setFormSubject("Subject"); bm.setFormBody("Body");
				 * bm.setSendingMessage("Uèitavanje...");
				 * bm.setSendingMessageSuccess("Poruka je uspješno poslana.");
				 * bm.send();
				 */
			}

		});
	}

}
