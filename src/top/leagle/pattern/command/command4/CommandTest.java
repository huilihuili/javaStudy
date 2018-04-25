package top.leagle.pattern.command.command4;

import org.junit.Test;

import top.leagle.pattern.command.command4.appliance.Light;
import top.leagle.pattern.command.command4.appliance.Stereo;
import top.leagle.pattern.command.command4.command.Command;
import top.leagle.pattern.command.command4.command.sub.LightOffCommand;
import top.leagle.pattern.command.command4.command.sub.LightOnCommand;
import top.leagle.pattern.command.command4.command.sub.MacroCommand;
import top.leagle.pattern.command.command4.command.sub.StereoOffWithCDCommand;
import top.leagle.pattern.command.command4.command.sub.StereoOnWithCDCommand;
import top.leagle.pattern.command.command4.control.RemoteControl;

public class CommandTest {

	@Test
	public void test1() {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light KitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(KitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(KitchenLight);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

		Command[] partyOn = { livingRoomLightOn, kitchenLightOn, stereoOnWithCD };
		Command[] partyOff = { livingRoomLightOff, kitchenLightOff, stereoOffWithCD };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);

		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);

		System.out.println("\n--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);

		System.out.println("\n--- Pushing Macro Undo ---");
		remoteControl.undoButtonWasPushed();
	}
}
