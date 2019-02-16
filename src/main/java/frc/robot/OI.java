/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.commands.DeployBallCargoShipCommandGroup;
import frc.robot.commands.DeployBallRocketLevel2CommandGroup;
import frc.robot.commands.DeployBallRocketLevel3;
import frc.robot.commands.DeployDiskLevel1CommandGroup;
import frc.robot.commands.DeployDiskLevel2CommandGroup;
import frc.robot.commands.DeployDiskLevel3CommandGroup;
import frc.robot.commands.DeployHatchPanelCommandGroup;
import frc.robot.commands.DriveForDistanceCommand;
import frc.robot.commands.DriveTrainHighShiftCommand;
import frc.robot.commands.DriveTrainLowShiftCommand;
import frc.robot.commands.IntakeBallCommandGroup;
import frc.robot.commands.LineFollowCommand;
import frc.robot.commands.MoveElevatorDownCommand;
import frc.robot.commands.MoveElevatorUpCommand;
import frc.robot.commands.ResetEncodersCommand;
import frc.robot.commands.RunVisionThreadCommand;
import frc.robot.commands.TurnAngleCommand;
import frc.robot.commands.TurnToTargetCommandGroup;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private Joystick leftJoy, rightJoy, secondaryJoy, driverStationJoy;
  
  public OI(){
  //Creates joystick objects for use
  driverStationJoy = new Joystick(RobotMap.LEFT_JOYSTICK);
  leftJoy = new Joystick(RobotMap.LEFT_JOYSTICK);
  rightJoy = new Joystick(RobotMap.RIGHT_JOYSTICK);
  secondaryJoy = new Joystick(RobotMap.SECONDARY_JOYSTICK);

    //Left joystick buttons
		setJoystickButtonWhenPressedCommand(leftJoy, 1, new DriveTrainHighShiftCommand());
		
		//Right joystick buttons
    setJoystickButtonWhenPressedCommand(rightJoy, 1, new DriveTrainLowShiftCommand());
    
    //Secondary Joystick Buttons
    setJoystickButtonWhenPressedCommand(secondaryJoy, 1, new DeployDiskLevel1CommandGroup());
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 2, new IntakeBallCommandGroup());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 3, new DeployDiskLevel2CommandGroup());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 4, new DeployDiskLevel3CommandGroup());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 5, new DeployBallCargoShipCommandGroup());
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 6, new DeployBallRocketLevel2CommandGroup());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 7, new DeployBallRocketLevel3());

    // setJoystickButtonWhenPressedCommand(secondaryJoy, 1, new DeployHatchPanelCommandGroup());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 2, new MoveElevatorUpCommand());
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 3, new LineFollowCommand());
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 5, new ResetEncodersCommand());
    // // setJoystickButtonWhenPressedCommand(secondaryJoy, 4, new CorrectAzimuthCommand());
    setJoystickButtonWhenPressedCommand(secondaryJoy, 6, new MoveElevatorDownCommand());
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 7, new DriveForDistanceCommand(50, 0.6, 0.6));
    // setJoystickButtonWhenPressedCommand(secondaryJoy, 8, new TurnToTargetCommandGroup());
  }

  //Gets the Y direction of the left drive joystick
	public double getLeftY() {
    return leftJoy.getY();
}

//Gets the Y direction of the left drive joystick
public double getLeftX() {
  return leftJoy.getX();
}

//Gets the Y direction of the right drive joystick
public double getRightY() {
    return rightJoy.getY();
}

//Gets the X direction of the right drive joystick
public double getRightX() {
  return rightJoy.getX();
}

private void setJoystickButtonWhenPressedCommand(GenericHID joystick, int button, Command command) {
  new JoystickButton(joystick, button).whenPressed(command);
}

private void setJoystickButtonWhileHeldCommand(GenericHID joystick, int button, Command command){
  new JoystickButton(joystick, button).whileHeld(command);
}

};
