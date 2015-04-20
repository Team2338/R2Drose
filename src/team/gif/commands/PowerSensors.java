package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class PowerSensors extends CommandBase {
    
    public PowerSensors() {
        requires(power);
    }

    protected void initialize() {}

    protected void execute() {
        power.givePower();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {}

    protected void interrupted() {}
}
