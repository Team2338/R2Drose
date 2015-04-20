package team.gif.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.commands.PowerSensors;

/**
 *
 * @author Patrick
 */
public class SensorPower extends Subsystem {
    
    private static final Solenoid power = new Solenoid(3);
    
    public void givePower() {
        power.set(true);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new PowerSensors());
    }
}
