package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class CollectStageFour extends CommandBase {
    
    public CollectStageFour() {
        requires(elevator);
    }

    protected void initialize() {}

    protected void execute() {
        elevator.driveMid(Globals.collectorSpeed);
        elevator.driveTop(Globals.collectorSpeed);
    }

    protected boolean isFinished() {
        return elevator.getTopSensor();
    }

    protected void end() {
        elevator.driveMid(0);
        elevator.driveTop(0);
    }

    protected void interrupted() {}
}
