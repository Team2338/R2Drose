package team.gif.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Patrick
 */
public class AutoCollect extends CommandGroup {
    
    public AutoCollect() {
        addSequential(new CollectStageOne());
        addSequential(new CollectStageTwo());
        addSequential(new CollectStageFour());
    }
}
