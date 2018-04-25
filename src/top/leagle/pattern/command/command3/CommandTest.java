package top.leagle.pattern.command.command3;

import org.junit.Test;

import top.leagle.pattern.command.command3.appliance.Light;
import top.leagle.pattern.command.command3.appliance.Stereo;
import top.leagle.pattern.command.command3.command.sub.LightOffCommand;
import top.leagle.pattern.command.command3.command.sub.LightOnCommand;
import top.leagle.pattern.command.command3.command.sub.StereoOffWithCDCommand;
import top.leagle.pattern.command.command3.command.sub.StereoOnWithCDCommand;
import top.leagle.pattern.command.command3.control.RemoteControl;

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

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCD, stereoOffWithCD);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);

	}
}
