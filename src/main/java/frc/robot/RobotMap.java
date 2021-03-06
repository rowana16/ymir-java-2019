/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // Drivetrain Encoder Constants
  public static final double WHEEL_DIAMETER = 6; // inches
  public static final double PULSES_PER_REVOLUTION = 1024;
  public static final double WHEELS_DISTANCE_PER_PULSE = (20.0 * WHEEL_DIAMETER * Math.PI)
      / (PULSES_PER_REVOLUTION * 60.0);

  // Wrist Encoder Constants
  public static final double WRIST_GEAR_DIAMETER = 1.7;
  public static final double WRIST_PULSES_PER_REVOLUTION = 1024;
  public static final double WRIST_DISTANCE_PER_PULSE = (WRIST_GEAR_DIAMETER * Math.PI) / WRIST_PULSES_PER_REVOLUTION;

  // Elevator Encoder Constants
  public static final double ELEVATOR_PULSES_PER_REVOLUTION = 1024;
  public static final double ELEVATOR_SPROCKET_CIRCUMFERENCE = 1.44 * Math.PI;
  public static final double ELEVATOR_DISTANCE_PER_PULSE = (16.0 * ELEVATOR_SPROCKET_CIRCUMFERENCE * 60.0)
      / (ELEVATOR_PULSES_PER_REVOLUTION * 24.0);

  // Rack Encoder Constants
  public static final double RACK_PULSES_PER_REVOLUTION = 1024;
  public static final double RACK_PITCH_DIAMETER = 1; // inches
  public static final double RACK_DISTANCE_PER_PULSE = Math.PI * RACK_PITCH_DIAMETER / PULSES_PER_REVOLUTION;

  // Joysticks
  public static final int LEFT_JOYSTICK = 0;
  public static final int RIGHT_JOYSTICK = 1;
  public static final int SECONDARY_JOYSTICK = 2;
  public static final int DRIVERSTATION_JOYSTICK = 0;
  public static final int DRIVERSTATION_LEFT_Y_AXIS = 1;
  public static final int DRIVERSTATION_RIGHT_Y_AXIS = 3;

  // Climber Constants
  public static final double CLIMBER_SPEED = 0.75;

  // Talons
  public static final int LEFT_DRIVE_TALON = 3;
  public static final int RIGHT_DRIVE_TALON = 5;
  public static final int ELEVATOR_TALON = 4;
  public static final int RACK_TALON = 2;
  public static final int CLIMBER_TALON = 0;
  public static final int WRIST_TALON = 1;

  // Victors
  public static final int LEFT_1_VICTOR = 0;
  public static final int LEFT_2_VICTOR = 2;
  public static final int RIGHT_1_VICTOR = 1;
  public static final int RIGHT_2_VICTOR = 5;
  public static final int ELEVATOR_VICTOR = 4;
  public static final int ROLLER_VICTOR = 3;

  // Speed constants
  public static final double ELEVATOR_TAL_SPEED = 0.3;
  public static final double ROLLER_VICTOR_SPEED = 0.7;

  // Solenoids
  public static final int[] DRIVE_TRAIN_SHIFT = { 0, 7 };
  public static final int[] DEPLOY_SOLENOID = { 2, 5 };
  public static final int[] INTAKE_SOLENOID = { 1, 6 };

  // Limit Switches
  public static final int LEFT_HATCH_PANEL_LIMIT = 1;
  public static final int RIGHT_HATCH_PANEL_LIMIT = 0;
  public static final int CLIMBER_UPPER_LIMIT = 2;
  public static final int CLIMBER_LOWER_LIMIT = 3;

  // Vision Constants
  public static final int IMAGE_WIDTH = 320;
  public static final double TAPE_BOUND_WIDTH_INCH = 3.3;
  public static final double FOCAL_LENGTH = (21 * 49.5) / TAPE_BOUND_WIDTH_INCH;
  public static final int JEVOIS_BAUD_RATE = 115200;
  public static final int FOV = 65;

  // Line Following Constants
  public static final int LEFT_LINE_FOLLOW = 0;
  public static final int CENTER_LINE_FOLLOW = 1;
  public static final int RIGHT_LINE_FOLLOW = 2;

  public static final int BEAM_BREAK = 8;

  public static final double[] ELEVATOR_LEVELS = { 1, 2, 3, 4, 5, 6, 7, 8 };
  public static final int WRIST_UPPER_ENCODER_LIMIT = 7;
  public static final int WRIST_LOWER_ENCODER_LIMIT = 0;

  public static final int RACK_LOWER_LIMIT = -100;
  public static final int RACK_UPPER_LIMIT = 100;
}
