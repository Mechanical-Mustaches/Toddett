package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;

public class R_StopCommand extends CommandBase {
    Roller roller;

    public R_StopCommand(Roller roller){
        addRequirements(roller);
        this.roller = roller;
    }

    public void execute(){
        roller.stop();
    }
    
}
