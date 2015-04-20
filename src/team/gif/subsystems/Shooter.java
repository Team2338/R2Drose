package team.gif.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.ShooterStandby;

/**
 *
 * @author Patrick
 */
public class Shooter extends Subsystem {
    
    private static final Victor shooter = new Victor(RobotMap.shooter);
    
    public void drive(double speed) {
        shooter.set(-speed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ShooterStandby());
    }
}
