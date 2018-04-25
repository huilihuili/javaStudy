package top.leagle.pattern.facade;

import org.junit.Test;

import top.leagle.pattern.facade.facade.HomeTheaterFacade;
import top.leagle.pattern.facade.hometheater.Amplifier;
import top.leagle.pattern.facade.hometheater.CdPlayer;
import top.leagle.pattern.facade.hometheater.DvdPlayer;
import top.leagle.pattern.facade.hometheater.PopcornPopper;
import top.leagle.pattern.facade.hometheater.Projector;
import top.leagle.pattern.facade.hometheater.Screen;
import top.leagle.pattern.facade.hometheater.TheaterLights;
import top.leagle.pattern.facade.hometheater.Tuner;

public class FacadeTest {

	@Test
	public void test1() {
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvdPlayer = new DvdPlayer();
		CdPlayer cdPlayer = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights theaterLights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();

		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector,
				theaterLights, screen, popcornPopper);

		homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
		homeTheaterFacade.endMovie("Raiders of the Lost Ark");
	}
}
