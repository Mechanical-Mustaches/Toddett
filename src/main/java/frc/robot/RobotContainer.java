// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Roller;
import frc.robot.commands.RollerCommands.*;


public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  Roller ryan = new Roller();

  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  static Joystick leftJoystick = new Joystick(OperatorConstants.kDriverControllerPort);
  static Joystick rightJoystick = new Joystick(OperatorConstants.kDriverControllerPort);




  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    JoystickButton a_Button = new JoystickButton(leftJoystick, 1);
    JoystickButton b_Button = new JoystickButton(leftJoystick, 2);
    JoystickButton x_Button = new JoystickButton(leftJoystick, 3);
    JoystickButton y_Button = new JoystickButton(leftJoystick, 4);


    x_Button.onTrue(new r_ForwardCommand(ryan)); 
    x_Button.onFalse(new r_Stop(ryan));

    
    y_Button.onTrue(new r_Backward(ryan));
    y_Button.onFalse(new r_Stop(ryan));


  }


  // public Command getAutonomousCommand() {
  //   // An example command will be run in autonomous
  //   return Autos.exampleAuto(m_exampleSubsystem);
  // }
}
