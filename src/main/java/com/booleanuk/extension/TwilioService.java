package com.booleanuk.extension;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioService {
    private static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    private static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    private static final String PHONE_NUMBER = System.getenv("PHONE_NUMBER");

    public TwilioService() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void send(String messageBody) {
        Message.creator(
                        new PhoneNumber(PHONE_NUMBER),
                        new PhoneNumber("+18146795876"),
                        messageBody)
                .create();
    }
}