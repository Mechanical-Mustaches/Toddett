package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Roller extends SubsystemBase{
    private CANSparkMax r_motor = new CANSparkMax(10, MotorType.kBrushless);
   
    private double r_speed = 0.4;
    RelativeEncoder r_encoder;
    
    DigitalInput input = new DigitalInput(0);

    public Roller(){
    }

   
    public void forward(){
        r_motor.set(r_speed);
    }

    public void canMoveForward(){
        if(input.get() == true){
            r_motor.set(r_speed);
        }
        else if(input.get() == false){
            r_motor.set(0);
        }
    }

    public boolean isRollingFoward(){
        if(r_encoder.getPosition() < 12){
            return true;
        }
        return false;
    }

    public void reverse(){
        r_motor.set(-r_speed);
    }

    public boolean isRollerReversed(){
        if(r_encoder.getPosition() > -12){
            return true;
        }
        return false;
    }

    public void stop(){
        r_motor.set(0);
    }



}

