package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class roller extends SubsystemBase {

    private double speed = 0.4;
    CANSparkMax motor = new CANSparkMax(10, MotorType.kBrushless);
    
    public roller(){

    }

    public void forward(){
        motor.set(speed);
    }

    public void stop(){
        motor.set(0);
    }

    public void backward(){
        motor.set(-speed);
    }
}
    

