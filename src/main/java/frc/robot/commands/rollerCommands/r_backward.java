package frc.robot.commands.rollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.roller;

public class r_backward extends CommandBase {
    roller Roller;

    public r_backward(roller Roller){
        addRequirements(Roller);
        this.Roller = Roller;
    }
    
    public void execute(){
        Roller.backward();
    }
}
