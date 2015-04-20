package team.gif.commands;

/**
 *
 * @author Patrick
 */
public class ElevatorStandby extends CommandBase {
    
    public ElevatorStandby() {
        requires(elevator);
    }

    protected void initialize() {}

    protected void execute() {
        elevator.driveBot(0);
        elevator.driveMid(0);
        elevator.driveTop(0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {}

    protected void interrupted() {}
}
