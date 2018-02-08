package com.bignerdranch.android.geoquiz;

/**
 * Created by michaeltoth on 2/1/18.
 */

public class Question {

    private  int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswered;

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        mAnswered = true;
        return mAnswerTrue;
    }


    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswered() {
        return mAnswered;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswered = false;
    }
}
