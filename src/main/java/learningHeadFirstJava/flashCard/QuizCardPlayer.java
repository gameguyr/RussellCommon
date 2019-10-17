////////////////////////
// TITLE: QuizCardPlayer
// AUTHOR: lego
// DATE: 2019-10-16
// PURPOSE: To make a flash card game style of GUI
////////////////////////
package learningHeadFirstJava.flashCard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class QuizCardPlayer {
    private JFrame frame;
    private JLabel multiUseLabel;
    private JTextArea displayTextArea;
    private JButton multiUseButton;

    private ArrayList<QuizCard> quizCardList = new ArrayList<>();
    private int currentCardIndex = 0;
    private QuizCard currentCard;
    private String buttontextShowAnswer = "Show Answer";
    private String buttontextNextCard = "Next Card";

    public static void main(String[] args){
        QuizCardPlayer quizCardPlayer = new QuizCardPlayer();
        quizCardPlayer.go();
    }

    public void go() {
        // build and display gui
        frame = new JFrame("Quiz Card Player");
        JPanel panel = new JPanel();
        Font textFont = new Font(Font.MONOSPACED, Font.ITALIC, 16);
        multiUseButton = new JButton(buttontextNextCard);
        multiUseLabel = new JLabel("Question");




        displayTextArea = new JTextArea(6, 30);
        displayTextArea.setLineWrap(true);
        displayTextArea.setWrapStyleWord(true);
        displayTextArea.setFont(textFont);

        JScrollPane displayScrollBarPane = new JScrollPane(displayTextArea);
        displayScrollBarPane.setHorizontalScrollBarPolicy(displayScrollBarPane.HORIZONTAL_SCROLLBAR_NEVER);
        displayScrollBarPane.setVerticalScrollBarPolicy(displayScrollBarPane.VERTICAL_SCROLLBAR_ALWAYS);




        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        menu.add(openMenuItem);
        menuBar.add(menu);

        openMenuItem.addActionListener( new OpenMenuListener() );
        multiUseButton.addActionListener( new MultiUseButtonListener() );

        panel.add(multiUseLabel);
        panel.add(displayScrollBarPane);
        panel.add(multiUseButton);

        frame.add(BorderLayout.CENTER, panel);


        // adding things to the frame and adjusting it
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);




    }

    class MultiUseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // if this is a question, show the answer, otherwise show next question
            // set a flag for whether we're viewing a question or answer
            if ( multiUseButton.getText().equals(buttontextShowAnswer) ) {
                displayTextArea.setText(currentCard.getAnswer());
                multiUseButton.setText(buttontextNextCard);
                multiUseLabel.setText("Answer");
            } else if ( multiUseButton.getText().equals(buttontextNextCard) ) {
                showNextCard();
            } else {
                System.out.println("Something went wrong with the button labels");
            }
        }
    }

    class OpenMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/main/java/learningHeadFirstJava/flashCard"));

            fileChooser.showOpenDialog(frame);
            loadFile(fileChooser.getSelectedFile());
            // let the user navigate to and choose a card set to open
        }
    }

    private void loadFile(File file) {
        BufferedReader bufferedReader = null;
        try {
            String lineOfFile;
            bufferedReader = new BufferedReader( new FileReader(file));
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                makeCard(lineOfFile);
            }
            bufferedReader.close();
            showNextCard();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeCard(String lineToParse) {
        String[] tempQuestionAnswer= lineToParse.split("/");
        if (tempQuestionAnswer.length> 0 ) {
            QuizCard tempQuizCard = new QuizCard(tempQuestionAnswer[0], tempQuestionAnswer[1]);
            quizCardList.add(tempQuizCard);
        }
    }

    private void showNextCard() {
        if ( currentCardIndex < quizCardList.size() ) {
            currentCard = quizCardList.get(currentCardIndex);
            currentCardIndex += 1;
            displayTextArea.setText(currentCard.getQuestion());
            multiUseButton.setText(buttontextShowAnswer);
            multiUseLabel.setText("Question");
        } else {
            displayTextArea.setText("There are no more cards in this file. Please load one from the menu");
        }


    }
}
