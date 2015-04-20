package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class ShooterStandby extends CommandBase {
    
    public ShooterStandby() {
        requires(shooter);
    }

    protected void initialize() {}

    protected void execute() {
        shooter.drive(0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {}

    protected void interrupted() {}
}
