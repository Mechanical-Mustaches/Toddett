package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;
import frc.robot.subsystems.LedLights;

public class R_ForwardCommand extends CommandBase{
    Roller roller;
    LedLights ledLights;


    public R_ForwardCommand(Roller roller, LedLights ledLights){
        addRequirements(roller, ledLights);
        this.roller = roller;
        this.ledLights = ledLights;
    }

    public void execute(){
        roller.forward();
        ledLights.setColor(100, 0, 0);
    }

    public boolean isFinsihed(){
        return roller.isRollingFoward();
    }
    
}
