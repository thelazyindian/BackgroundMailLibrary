Background Mail Library 1.3
=====================

Android Library for sending mail in background

**How to use it**

            BackgroundMail bm = new BackgroundMail(context);
            bm.setGmailUserName("yourgmail@gmail.com");
            bm.setGmailPassword("yourgmailpassword");
            bm.setMailTo("receiver@gmail.com");
            bm.setFormSubject("Subject");
            bm.setFormBody("Body");
            bm.send();
            
**Permissions**

            <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
            <uses-permission android:name="android.permission.INTERNET"/>
            
**This is optional**

            bm.setSendingMessage("Loading...");
            bm.setSendingMessageSuccess("Your message was sent successfully.");
            bm.setProcessVisibility(false);
            
**Changelog**

            - version 1.3
            Added password encryption for better security
            - version 1.2
            Added process visibility feature
            - version 1.1
            Added demo
            Bug fix
            - version 1.0
            First commit

**Credits**

            © 2013-2014 Kristijan Drača     
            
**License**

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


