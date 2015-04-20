package team.gif;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team.gif.commands.*;


public class OI {
    
    public static final Joystick leftStick = new Joystick(1);
    public static final Joystick rightStick = new Joystick(2);
    
    private static Button leftTrigger;
    private static Button rightTrigger;
    private static Button right2;
    private static Button right3;
    
    public OI() {
        leftTrigger = new JoystickButton(leftStick, 1);
        rightTrigger = new JoystickButton(rightStick, 1);
        right2 = new JoystickButton(rightStick, 2);
        right3 = new JoystickButton(rightStick, 3);
        
        leftTrigger.whenPressed(new RapidFire());
        rightTrigger.whenPressed(new AutoFire());
        right2.whenPressed(new AutoCollect());
        right3.whileHeld(new Eject());
    }
}

