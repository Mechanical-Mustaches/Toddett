package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;

public class R_ReverseCommand extends CommandBase {
    Roller roller;

    public R_ReverseCommand(Roller roller){
        addRequirements(roller);
        this.roller = roller;
    }

    public void execute(){
        roller.reverse();
    }

    public boolean isFinsihed(){
        return roller.isRollerReversed();
    }
    
}
