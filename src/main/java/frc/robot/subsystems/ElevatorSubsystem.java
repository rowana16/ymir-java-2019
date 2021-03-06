/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;
import frc.robot.controls.CustomTalon;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends PIDSubsystem {
  private CustomTalon elevatorTalon;
  private VictorSPX elevatorVictor;

  public ElevatorSubsystem() {
    super(1, 0, 0);
    elevatorTalon = new CustomTalon(RobotMap.ELEVATOR_TALON);
    elevatorVictor = new VictorSPX(RobotMap.ELEVATOR_VICTOR);
    elevatorTalon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    elevatorVictor.follow(elevatorTalon);
  }

  

  public void elevatorStop() {
    elevatorTalon.set(0);
  }

  public void resetElevatorEncoder() {
    elevatorTalon.setSelectedSensorPosition(0);
  }

  public double getElevatorEncoder() {
    return elevatorTalon.getSelectedSensorPosition()*RobotMap.ELEVATOR_DISTANCE_PER_PULSE;
  }

  public void moveElevatorUp() {
    elevatorTalon.set(RobotMap.ELEVATOR_TAL_SPEED);
  }

  public void moveElevatorDown() {
    elevatorTalon.set(-RobotMap.ELEVATOR_TAL_SPEED);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
    return getElevatorEncoder();
  }

  @Override
  protected void usePIDOutput(double output) {
    elevatorTalon.set(output);
  }
}
