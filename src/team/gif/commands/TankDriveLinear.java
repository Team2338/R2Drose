package team.gif.commands;

import team.gif.Globals;
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
    	if (Math.abs(OI.leftStick.getY()) > Globals.deadzone) {
    		chassis.driveLeft(OI.leftStick.getY());
    	} else {
    		chassis.driveLeft(0);
    	}
    	
    	if (Math.abs(OI.rightStick.getY()) > Globals.deadzone) {
    		chassis.driveRight(OI.rightStick.getY());
    	} else {
    		chassis.driveRight(0);
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
