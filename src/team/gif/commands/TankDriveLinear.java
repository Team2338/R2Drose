package team.gif.commands;

import team.gif.OI;

/**
 *
 * @author Patrick
 */
public class TankDriveLinear extends CommandBase {
    
    public TankDriveLinear() {
        requires(chassis);
    }

    protected void initialize() {
    }

    protected void execute() {
        chassis.driveLeft(OI.leftStick.getY());
        chassis.driveRight(OI.rightStick.getY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
