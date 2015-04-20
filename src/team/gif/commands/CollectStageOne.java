package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class CollectStageOne extends CommandBase {
    
    public CollectStageOne() {
        requires(elevator);
    }

    protected void initialize() {}

    protected void execute() {
        elevator.driveBot(Globals.collectorSpeed);
    }

    protected boolean isFinished() {
        return elevator.getBotSensor();
    }

    protected void end() {
        elevator.driveBot(0);
    }

    protected void interrupted() {}
}
