package com.example.william_st.socketioclient;

import android.graphics.Bitmap;

/**
 * Created by William_ST on 04/06/15.
 */
public class Message {

    public static final int TYPE_MESSAGE = 0;

    private int mType;
    private String mMessage;
    private Bitmap mImage;

    private Message() {}

    public int getType() {
        return mType;
    };

    public String getMessage() {
        return mMessage;
    };

    public Bitmap getImage() {
        return mImage;
    };


    public static class Builder {
        private final int mType;
        private Bitmap mImage;
        private String mMessage;

        public Builder(int type) {
            mType = type;
        }

        public Builder image(Bitmap image) {
            mImage = image;
            return this;
        }

        public Builder message(String message) {
            mMessage = message;
            return this;
        }

        public Message build() {
            Message message = new Message();
            message.mType = mType;
            message.mImage = mImage;
            message.mMessage = mMessage;
            return message;
        }
    }
}