package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Patrick
 */
public class Eject extends CommandBase {
    
    public Eject() {
        requires(elevator);
        requires(shooter);
    }

    protected void initialize() {}

    protected void execute() {
        elevator.driveBot(-Globals.collectorSpeed);
        elevator.driveMid(-Globals.collectorSpeed);
        elevator.driveTop(-Globals.collectorSpeed);
        shooter.drive(-Globals.shooterSpeed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        elevator.driveBot(0);
        elevator.driveMid(0);
        elevator.driveTop(0);
        shooter.drive(0);
    }

    protected void interrupted() {}
}
