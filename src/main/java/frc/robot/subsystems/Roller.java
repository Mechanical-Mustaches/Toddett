package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LedLights;

public class Roller extends SubsystemBase{
    private CANSparkMax r_motor = new CANSparkMax(10, MotorType.kBrushless);
   
    private double r_speed = 0.4;
    RelativeEncoder r_encoder;
    LedLights r_ledLights;

    public Roller(){
    }

   
    public void forward(){
        r_motor.set(r_speed);
        r_ledLights.setColor(100, 0, 0);
        
    }

    public boolean isRollingFoward(){
        if(r_encoder.getPosition() < 12){
           // r_lights.setColor(0, 100, 0);
            return true;
        }
        return false;
    }

    public void reverse(){
        r_motor.set(-r_speed);
       // r_lights.setColor(0, 100, 100);
    }

    public boolean isRollerReversed(){
        if(r_encoder.getPosition() > -12){
          //  r_lights.setColor(0, 100, 100);
            return true;
        }
        return false;
    }

    public void stop(){
        r_motor.set(0);
       // r_lights.setColor(100, 0, 0);
    }



}

