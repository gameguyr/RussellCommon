////////////////////////
// TITLE: QuizCard
// AUTHOR: lego
// DATE: 2019-10-15
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.flashCard;

public class QuizCard {
    private String question;
    private String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
