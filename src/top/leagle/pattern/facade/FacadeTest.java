package top.leagle.pattern.facade;

import org.junit.Test;

import top.leagle.pattern.facade.facade.HomeTheaterFacade;
import top.leagle.pattern.facade.hometheater.Amplifier;
import top.leagle.pattern.facade.hometheater.DvdPlayer;
import top.leagle.pattern.facade.hometheater.PopcornPopper;
import top.leagle.pattern.facade.hometheater.Projector;
import top.leagle.pattern.facade.hometheater.Screen;
import top.leagle.pattern.facade.hometheater.TheaterLights;

public class FacadeTest {

	@Test
	public void test1() {
		Amplifier amplifier = new Amplifier();
		DvdPlayer dvdPlayer = new DvdPlayer();
		Projector projector = new Projector();
		TheaterLights theaterLights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();

		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, theaterLights,
				screen, popcornPopper);

		homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
		homeTheaterFacade.endMovie("Raiders of the Lost Ark");
	}
}
