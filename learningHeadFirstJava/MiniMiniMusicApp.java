import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String [] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();

    }

    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage changeInstrumentMessage = new ShortMessage();
            changeInstrumentMessage.setMessage(192, 1, 40, 0);
            MidiEvent changeInstrumentEvent = new MidiEvent(changeInstrumentMessage, 1);
            track.add(changeInstrumentEvent);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 60, 100);
            MidiEvent noteOn = new MidiEvent(a, 2);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 60, 100);
            MidiEvent noteOff = new MidiEvent(b, 6);
            track.add(noteOff);


            player.setSequence(seq);
            player.start();

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
