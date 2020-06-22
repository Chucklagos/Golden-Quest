package clases;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ReproduceAudio {

	public void reproducir(){
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("fondo.wav")));
            sonido.start();
            while (sonido.isRunning())
                Thread.sleep(1000);
            sonido.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
	}
}

