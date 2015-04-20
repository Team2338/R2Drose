package team.gif.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.TankDriveLinear;

/**
 *
 * @author Patrick
 */
public class Drivetrain extends Subsystem {
    
    private static final Victor frontLeft = new Victor(RobotMap.frontLeft);
    private static final Victor frontRight = new Victor(RobotMap.frontRight);
    
    public void driveLeft(double speed) {
        frontLeft.set(-speed);
    }
    
    public void driveRight(double speed) {
        frontRight.set(speed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveLinear());
    }
}
