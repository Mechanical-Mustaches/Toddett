package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LedLights;
import frc.robot.subsystems.Roller;

public class R_StopCommand extends CommandBase {
    Roller roller;
    LedLights ledLights;

    public R_StopCommand(Roller roller, LedLights ledLights){
        addRequirements(roller, ledLights);
        this.roller = roller;
        this.ledLights = ledLights;
        
    }

    public void execute(){
        roller.stop();
        ledLights.defaultColor();

    }
    
}
