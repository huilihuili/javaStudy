package top.leagle.pattern.facade.facade;

import top.leagle.pattern.facade.hometheater.Amplifier;
import top.leagle.pattern.facade.hometheater.DvdPlayer;
import top.leagle.pattern.facade.hometheater.PopcornPopper;
import top.leagle.pattern.facade.hometheater.Projector;
import top.leagle.pattern.facade.hometheater.Screen;
import top.leagle.pattern.facade.hometheater.TheaterLights;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private TheaterLights theaterLights;
	private Screen screen;
	private PopcornPopper popcornPopper;

	public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, TheaterLights theaterLights,
			Screen screen, PopcornPopper popcornPopper) {
		this.amplifier = amplifier;
		this.dvdPlayer = dvdPlayer;
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
