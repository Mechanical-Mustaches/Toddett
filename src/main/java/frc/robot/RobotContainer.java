// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
/*
 * COMMAND IMPORTS
 */
import frc.robot.commands.RollerCommands.*;
import frc.robot.commands.ShooterCommands.DistanceSensor;
import frc.robot.commands.ShooterCommands.s_Stop;

/*
 * SUBSYSTEM IMPORTS
 */

 import frc.robot.subsystems.Roller;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.LedLights;


public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  XboxController m_driverController = new XboxController(OperatorConstants.kDriverControllerPort);
  static Joystick leftJoystick = new Joystick(OperatorConstants.kDriverControllerPort);
  static Joystick rightJoystick = new Joystick(OperatorConstants.kDriverControllerPort);

  LedLights LEDs = new LedLights();
  Roller roller = new Roller();
  Shooter shooter = new Shooter();



  public RobotContainer() {
    configureBindings();

    LEDs.defaultColor();
  }

  private void configureBindings() {
    JoystickButton Button_X = new JoystickButton(leftJoystick, 3);
    JoystickButton Button_Y = new JoystickButton(leftJoystick, 4);
    JoystickButton Button_A = new JoystickButton(leftJoystick, 1);
    JoystickButton Button_B = new JoystickButton(leftJoystick, 2);

    Button_X.onTrue(new R_ForwardCommand(roller, LEDs));
    Button_X.onFalse(new R_StopCommand(roller, LEDs));

    Button_Y.onTrue(new R_ReverseCommand(roller, LEDs));
    Button_Y.onFalse(new R_StopCommand(roller, LEDs));

    Button_A.onTrue(new DistanceSensor(shooter));
    Button_A.onFalse(new s_Stop(shooter));

    Button_B.onTrue(new R_CanMoveFord(roller));
    Button_B.onFalse(new R_StopCommand(roller, LEDs));
    
  }


  // public Command getAutonomousCommand() {
  //   // An example command will be run in autonomous
  //   return Autos.exampleAuto(m_exampleSubsystem);
  // }
}
