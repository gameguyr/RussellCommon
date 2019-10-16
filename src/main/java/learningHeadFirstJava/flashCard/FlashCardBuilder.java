////////////////////////
// TITLE: FlashCardBuilder
// AUTHOR: lego
// DATE: 2019-10-15
// PURPOSE: 
////////////////////////
package learningHeadFirstJava.flashCard;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardBuilder {
    private JTextArea questionTextArea;
    private JTextArea answerTextArea;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;


    public static void main(String[] args) {
        FlashCardBuilder flashCardBuilder = new FlashCardBuilder();
        flashCardBuilder.go();
    }

    private void go() {

        // creating some components
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        JLabel questionLabel = new JLabel("Question");
        JLabel answerLabel = new JLabel("Answer");
        JButton nextButton = new JButton("Next Card");
        cardList = new ArrayList<>();
        Font bigFont = new Font(Font.SERIF, Font.BOLD, 24);

        // creating and formatting the text boxes
        questionTextArea = new JTextArea(6, 20);
        questionTextArea.setLineWrap(true);
        questionTextArea.setWrapStyleWord(true);
        questionTextArea.setFont(bigFont);

        JScrollPane questionScroller = new JScrollPane(questionTextArea);
        questionScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        questionScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


        answerTextArea = new JTextArea(6, 20);
        answerTextArea.setLineWrap(true);
        answerTextArea.setWrapStyleWord(true);
        answerTextArea.setFont(bigFont);

        JScrollPane answerScroller = new JScrollPane(answerTextArea);
        answerScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        answerScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);






        // adding the components to the panel
        mainPanel.add(questionLabel);
        mainPanel.add(questionScroller);
        mainPanel.add(answerLabel);
        mainPanel.add(answerScroller);
        mainPanel.add(nextButton);



        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        //register listeners
        nextButton.addActionListener( new NextButtonListener() );
        newMenuItem.addActionListener( new NewMenuListener() );
        saveMenuItem.addActionListener( new SaveMenuListener() );

        // Adding items to the menu
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);


        // adding things to the frame and adjusting it
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setVisible(true);

    }

    public class NextButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            QuizCard quizCard = new QuizCard(questionTextArea.getText(), answerTextArea.getText());
            cardList.add(quizCard);
            clearCard();
        }

    }

    private void clearCard() {
        questionTextArea.setText("");
        answerTextArea.setText("");
        questionTextArea.requestFocus();
    }

    private class NewMenuListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            cardList.clear();
            clearCard();

        }
    }

    private class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            QuizCard quizCard = new QuizCard(questionTextArea.getText(), answerTextArea.getText());
            cardList.add(quizCard);
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());


        }
    }

    private void saveFile(File selectedFile) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(selectedFile));
            for (QuizCard quizCard:cardList) {
                bufferedWriter.write(quizCard.getQuestion() + "/");
                bufferedWriter.write(quizCard.getAnswer() + "\n");
            }
            bufferedWriter.close();

        } catch(IOException exception) {
            System.out.println("Failed to save the file due to: " + exception);
            exception.printStackTrace();
        }
    }
}
