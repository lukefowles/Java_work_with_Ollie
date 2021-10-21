package com.questionnaire;

public class Questionnaire {
//    private Person2 id;
    private Question[] listOfQuestions;
    private int count;
    private int maxQuestionNumber;

    public Questionnaire( int count, int maxQuestionNumber) {
        this.listOfQuestions = new Question[maxQuestionNumber];
        this.count = count;
        this.maxQuestionNumber = maxQuestionNumber;
    }

    public int getCount() {
        return count;
    }

    public int getMaxQuestionNumber() {
        return maxQuestionNumber;
    }

    public void setMaxQuestionNumber(int maxQuestionNumber) {
        this.maxQuestionNumber = maxQuestionNumber;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Question[] getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(Question[] listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }
}
