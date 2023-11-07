package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LedLights;
import frc.robot.subsystems.Roller;

public class R_ReverseCommand extends CommandBase {
    Roller roller;
    LedLights ledLights;

    public R_ReverseCommand(Roller roller, LedLights ledLights){
        addRequirements(roller, ledLights);
        this.roller = roller;
        this.ledLights = ledLights;
    }

    public void execute(){
        ledLights.setColor(100, 0, 100);
        roller.reverse();
    }

    public boolean isFinsihed(){
        return roller.isRollerReversed();
    }
    
}
