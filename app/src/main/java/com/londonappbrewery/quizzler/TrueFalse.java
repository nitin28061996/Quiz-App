package com.londonappbrewery.quizzler;

/**
 * Created by lalith on 14-01-2018.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;
    public TrueFalse(int questionResourceId,boolean trueOrFalse){
        mQuestionId = questionResourceId;
        mAnswer = trueOrFalse;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}

