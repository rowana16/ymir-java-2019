//*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.controls.CustomTalon;

/**
 * Add your docs here.
 */
public class ClimerSubsystem extends Subsystem {
  private CustomTalon climberTal;
  private DigitalInput upperLimit, lowerLimit;

  public ClimerSubsystem(){
    climberTal = new CustomTalon(RobotMap.CLIMBER_TALON);
    upperLimit = new DigitalInput(RobotMap.CLIMBER_UPPER_LIMIT);
    lowerLimit = new DigitalInput(RobotMap.CLIMBER_LOWER_LIMIT);
  }

  public void useClimber(){
    climberTal.set(ControlMode.PercentOutput, RobotMap.CLIMBER_SPEED);
  }

  public boolean getUpperSwitch(){
    return upperLimit.get();
  }

  public boolean getLowerSwitch(){
    return lowerLimit.get();
  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
