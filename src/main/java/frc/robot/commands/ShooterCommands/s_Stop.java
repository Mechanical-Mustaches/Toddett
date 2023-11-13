package frc.robot.commands.ShooterCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class s_Stop extends CommandBase{
    Shooter shooter;
    
    public s_Stop(Shooter shooter){
        addRequirements(shooter);
        this.shooter = shooter;
    }

    public void execute(){
        shooter.stop();
    }
}
