// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;

import java.util.function.Supplier;



public class MecanumDriveCommand extends CommandBase {
  
private DrivetrainSubsystem driveSub;
private Supplier<Double> xSpeed, ySpeed, zRotate;
  /** Creates a new MecanumDriveCommand. */
  public MecanumDriveCommand(DrivetrainSubsystem dSub, Supplier<Double> straight, Supplier <Double>strafe, Supplier<Double> turn) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveSub = dSub;
    xSpeed = straight;
    ySpeed = strafe;
    zRotate = turn;
    addRequirements(driveSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {driveSub.driveCartesian​(xSpeed.get(), ySpeed.get(), zRotate.get());}
   
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
