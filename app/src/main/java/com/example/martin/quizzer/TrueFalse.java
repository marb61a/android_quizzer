package com.example.martin.quizzer;

/**
 * Created by martin on 25/01/18.
 */

// This class acts as the blueprint for a single true or false question
public class TrueFalse {
    // These are member variables which hold the question id and the correct answer
    private int mQuestionID;
    private boolean mAnswer;

    // The constructor that will be used when creating new questions
    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
