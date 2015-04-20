package team.gif.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Patrick
 */
public class RapidFire extends CommandGroup {
    
    public RapidFire() {
        addSequential(new AutoFire());
        if (CommandBase.elevator.getMidSensor()) {
            addSequential(new AutoFire());
            if (CommandBase.elevator.getBotSensor()) {
                addSequential(new AutoFire());
            }
        }
    }
}
