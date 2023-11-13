package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class DistanceSensor extends CommandBase {
    Shooter shooter;

    public DistanceSensor(Shooter shooter){
        addRequirements(shooter);
        this.shooter = shooter;
    }

    public void execute(){
        shooter.distanceTracking();
    }

}
