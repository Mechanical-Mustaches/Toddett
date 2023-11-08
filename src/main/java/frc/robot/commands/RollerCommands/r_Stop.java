package frc.robot.commands.RollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Roller;

public class r_Stop extends CommandBase {
    Roller ryan;

    public r_Stop(Roller ryan){
        addRequirements(ryan);
        this.ryan = ryan;
    }

    public void execute(){
        ryan.stop();
    }
    
}
