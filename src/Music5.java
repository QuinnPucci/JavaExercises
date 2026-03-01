/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Modified Music5 class example from TIJ to include
Playable interface which defines the ability to play a musical note.
This was separated from the existing interface instrument.
-------------------------------*/

//: interfaces/music5/Music5.java
// Interfaces.
import util.Note;
import static util.Print.*; // had to modify the imports from the given class.

interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:
     // Automatically public
    void adjust();
}

/*-------------------------------
This is the new interface.
Plays the given musical note.
-------------------------------*/
interface Playable{
    void play(Note n);
}

class Wind implements Instrument, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion implements Instrument, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed implements Instrument, Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {

    // Plays a standard tuning note on a playable object using the playable interface

    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    // Tunes every playable in the array

    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Array now stores playable refs since tune and tuneall depend on play
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~