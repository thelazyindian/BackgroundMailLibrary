Background Mail Library

Android Library for sending mail in background

How to use it

            BackgroundMail bm = new BackgroundMail(context);
            bm.setGmailUserName("yourgmail@gmail.com");
            bm.setGmailPassword("yourgmailpassword");
            bm.setMailTo("receiver@gmail.com");
            bm.setFormSubject("Subject");
            bm.setFormBody("Body");
            bm.send();
            
Permissions

            <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
            <uses-permission android:name="android.permission.INTERNET"/>
            
Custom messagess

            bm.setSendingMessage("Loading...");
            bm.setSendingMessageSuccess("Your message was sent successfully.");
