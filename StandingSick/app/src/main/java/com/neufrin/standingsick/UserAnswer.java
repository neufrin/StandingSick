package com.neufrin.standingsick;

/**
 * Created by neufrin on 13.11.2015.
 */
public class UserAnswer {
    private Long Id;
    private Long SessionId;
    private Long AId;
    private Long QId;
    private String Question;
    private String Answer;

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getSessionId() {
        return SessionId;
    }

    public void setSessionId(Long session) {
        SessionId = session;
    }

    public Long getAId() {
        return AId;
    }

    public void setAId(Long AId) {
        this.AId = AId;
    }

    public Long getQId() {
        return QId;
    }

    public void setQId(Long QId) {
        this.QId = QId;
    }
}
