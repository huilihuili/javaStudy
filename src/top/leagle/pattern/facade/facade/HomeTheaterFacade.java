package top.leagle.pattern.facade.facade;

import top.leagle.pattern.facade.hometheater.Amplifier;
import top.leagle.pattern.facade.hometheater.CdPlayer;
import top.leagle.pattern.facade.hometheater.DvdPlayer;
import top.leagle.pattern.facade.hometheater.PopcornPopper;
import top.leagle.pattern.facade.hometheater.Projector;
import top.leagle.pattern.facade.hometheater.Screen;
import top.leagle.pattern.facade.hometheater.TheaterLights;
import top.leagle.pattern.facade.hometheater.Tuner;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private TheaterLights theaterLights;
	private Screen screen;
	private PopcornPopper popcornPopper;

	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
			Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theaterLights = theaterLights;
		this.screen = screen;
		this.popcornPopper = popcornPopper;
	}

	public void watchMovie(String movie) {
		System.out.println("\nGet ready to watch a movie...");
		popcornPopper.on();
		popcornPopper.pop();
		theaterLights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd();
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	public void endMovie(String movie) {
		System.out.println("\nShutting movie theater down...");
		popcornPopper.off();
		theaterLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop(movie);
		dvdPlayer.eject();
		dvdPlayer.off();
	}

}
