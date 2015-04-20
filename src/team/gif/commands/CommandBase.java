package team.gif.commands;

import edu.wpi.first.wpilibj.command.Command;
import team.gif.OI;
import team.gif.subsystems.*;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static Drivetrain chassis = new Drivetrain();
    public static Elevator elevator = new Elevator();
    public static Shooter shooter = new Shooter();
    public static SensorPower power = new SensorPower();

    public static void init() {
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
