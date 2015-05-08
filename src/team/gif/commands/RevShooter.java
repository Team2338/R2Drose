package team.gif.commands;

import team.gif.Globals;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RevShooter extends Command {
	
	private double initTime;

    public RevShooter() {
        requires(CommandBase.shooter);
    }

    protected void initialize() {
    	initTime = Timer.getFPGATimestamp();
    }

    protected void execute() {
    	CommandBase.shooter.drive(Globals.shooterSpeed);
    	Globals.isRevved = (Timer.getFPGATimestamp() - initTime > Globals.fireTime);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Globals.isRevved = true;
    }

    protected void interrupted() {}
}
