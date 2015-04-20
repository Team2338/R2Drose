package team.gif;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import team.gif.commands.CommandBase;
import team.gif.commands.PowerSensors;
import team.gif.commands.TankDriveLinear;


public class Rose extends IterativeRobot {

    Command teleopCommand;
    Command power = new PowerSensors();

    public void robotInit() {
        teleopCommand = new TankDriveLinear();
        power.setRunWhenDisabled(true);
        power.start();
        
        // Initialize all subsystems
        CommandBase.init();
    }

    public void autonomousInit() {
        
    }


    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        teleopCommand.start();
    }


    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        System.out.print(CommandBase.elevator.getBotSensor() + ", ");
        System.out.print(CommandBase.elevator.getMidSensor() + ", ");
        System.out.println(CommandBase.elevator.getTopSensor());
    }
    

    public void disabledInit() {
        
    }
    
    public void disabledPeriodic() {
        
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
