package frc.robot.commands.rollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.roller;

public class r_forward extends CommandBase{
    roller Roller;

    public r_forward(roller Roller){
        addRequirements(Roller);
        this.Roller = Roller;
    }

    public void execute(){
        Roller.forward();
    }
    
}
