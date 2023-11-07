// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.roller;
import frc.robot.commands.rollerCommands.*;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  roller Roller = new roller();

  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  static Joystick leftjoystick = new Joystick(OperatorConstants.kDriverControllerPort);
  static Joystick Rightjoystick = new Joystick(OperatorConstants.kDriverControllerPort);



  
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    JoystickButton x_button = new JoystickButton(leftjoystick,3);
    JoystickButton y_button = new JoystickButton(leftjoystick,4);



    x_button.onTrue(new r_forward(Roller));
    x_button.onFalse(new r_stop(Roller));

    y_button.onTrue(new r_backward(Roller));
    y_button.onFalse(new r_stop(Roller));


  
  }


  // public Command getAutonomousCommand() {
  //   // An example command will be run in autonomous
  //   return Autos.exampleAuto(m_exampleSubsystem);
  // }
}
