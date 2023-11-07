package frc.robot.commands.rollerCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.roller;

public class r_stop extends CommandBase{
   roller Roller;

   public r_stop(roller Roller){
    addRequirements(Roller);
    this.Roller =Roller;
   }

   public void execute(){
    Roller.stop();
   }

    
}
