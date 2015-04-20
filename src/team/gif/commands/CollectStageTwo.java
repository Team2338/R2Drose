package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class CollectStageTwo extends CommandBase {
    
    public CollectStageTwo() {
        requires(elevator);
    }

    protected void initialize() {}

    protected void execute() {
        elevator.driveBot(Globals.collectorSpeed);
        elevator.driveMid(Globals.collectorSpeed);
    }

    protected boolean isFinished() {
        return elevator.getMidSensor();
    }

    protected void end() {
        elevator.driveBot(0);
        elevator.driveMid(0);
    }

    protected void interrupted() {}
}
