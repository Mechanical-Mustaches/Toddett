package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;

public class R_CanMoveFord extends CommandBase {
    Roller roller;

    public R_CanMoveFord(Roller roller){
        addRequirements(roller);
        this.roller = roller;
    }

    public void execute(){
        roller.canMoveForward();
    }
    
}
