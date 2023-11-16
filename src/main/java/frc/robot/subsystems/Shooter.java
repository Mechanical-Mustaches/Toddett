package frc.robot.subsystems;

import com.playingwithfusion.TimeOfFlight;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    CANSparkMax s_motor = new CANSparkMax(9, MotorType.kBrushless);
    private double speed = 0.5;
   // TimeOfFlight r_distanceSensor = new TimeOfFlight(0);

    public Shooter(){
       // r_distanceSensor.pidGet();
    }

    public void distanceTracking(){
      // r_distanceSensor.getRangeSigma();
    }


    public void forward(){
        s_motor.set(speed);
    }

    public void reverse(){
        s_motor.set(-speed);
    }

    public void stop(){
        s_motor.set(0);
    }
    
}
