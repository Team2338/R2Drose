package team.gif.commands;

import edu.wpi.first.wpilibj.Timer;
import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class Fire extends CommandBase {
    
    private double initTime;
    
    public Fire() {
        requires(elevator);
        requires(shooter);
    }

    protected void initialize() {
        initTime = Timer.getFPGATimestamp();
    }

    protected void execute() {
        shooter.drive(Globals.shooterSpeed);
        
        if (Timer.getFPGATimestamp() - initTime > Globals.fireTime) {
            elevator.driveTop(Globals.collectorSpeed);
        }
        
    }

    protected boolean isFinished() {
        return ((Timer.getFPGATimestamp() - initTime) > (Globals.fireTime + Globals.fireCooldown));
    }

    protected void end() {
        shooter.drive(0);
        elevator.driveTop(0);
    }

    protected void interrupted() {}
}
