////////////////////////
// TITLE: MiniMusicPlayer1
// AUTHOR: lego
// DATE: 2019-08-22
// PURPOSE: This is to have a little music app that play like a random sequence of notes.
// The important new thing that we are doing is to add this function tha tmakes our events for us.
////////////////////////
package learningHeadFirstJava.learningGUI;

import javax.sound.midi.*;

public class MiniMusicPlayer1 {

    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 61; i = i + 4) {
                track.add(makeEvent(144, 1, i, 108, i));
                track.add(makeEvent(128, 1, i, 108, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception exception) {
            System.out.println("Failed to make the correct sequencer: " + exception);
        }
    }

    private static MidiEvent makeEvent(int command, int channel, int data1, int data2, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(command, channel, data1, data2);
            event = new MidiEvent(shortMessage, tick);


        } catch (Exception exception) {
            System.out.println("Failed to make event: " + exception);
        }
        return event;
    }

}
