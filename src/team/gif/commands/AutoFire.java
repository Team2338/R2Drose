package team.gif.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Patrick
 */
public class AutoFire extends CommandGroup {
    
    public AutoFire() {
        addSequential(new Fire());
        
        if (CommandBase.elevator.getMidSensor()) {
            addSequential(new CollectStageFour(), 0.5);
        }
        
        if (CommandBase.elevator.getBotSensor()) {
            addSequential(new CollectStageTwo(), 0.5);
        }
    }
}
