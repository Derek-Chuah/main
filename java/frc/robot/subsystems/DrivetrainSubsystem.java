// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants.DrivetrainConstants;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DrivetrainSubsystem. 
   * @return */
  private WPI_TalonFX frontLeft = new WPI_TalonFX(DrivetrainConstants.frontLeftMID);
  private WPI_TalonFX rearLeft = new WPI_TalonFX(DrivetrainConstants.backLeftMID);
  private WPI_TalonFX frontRight = new WPI_TalonFX(DrivetrainConstants.frontRightMID);
  private WPI_TalonFX rearRight = new WPI_TalonFX(DrivetrainConstants.backRightMID);

  private MecanumDrive m_drive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);

  public DrivetrainSubsystem() {
    rearLeft.setInverted(true);
    frontLeft.setInverted(true);
  }


  @Override
  public void periodic() {

  }
    // This method will be called once per scheduler run

  public void driveCartesian​(double xSpeed, double ySpeed, double zRotation){
    m_drive.driveCartesian(xSpeed, ySpeed, zRotation);

    
  }


  public void setMecanumDrive(Double double1, Double double2, Double double3) {
  }}
        

