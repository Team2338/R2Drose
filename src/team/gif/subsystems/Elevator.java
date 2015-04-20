package team.gif.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.RobotMap;
import team.gif.commands.ElevatorStandby;

/**
 *
 * @author Patrick
 */
public class Elevator extends Subsystem {
    
    private static final Victor botMotor = new Victor(RobotMap.elevOne);
    private static final Victor midMotor = new Victor(RobotMap.elevTwo);
    private static final Victor topMotor = new Victor(RobotMap.elevThree);
    private static final DigitalInput botSensor = new DigitalInput(RobotMap.lightOne);
    private static final DigitalInput midSensor = new DigitalInput(RobotMap.lightTwo);
    private static final DigitalInput topSensor = new DigitalInput(RobotMap.lightThree);
    
    public void driveBot(double speed) {
        botMotor.set(speed);
    }
    
    public void driveMid(double speed) {
        midMotor.set(speed);
    }
    
    public void driveTop(double speed) {
        topMotor.set(-speed);
    }
    
    public boolean getBotSensor() {
        return botSensor.get();
    }
    
    public boolean getMidSensor() {
        return midSensor.get();
    }
    
    public boolean getTopSensor() {
        return topSensor.get();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ElevatorStandby());
    }
}
