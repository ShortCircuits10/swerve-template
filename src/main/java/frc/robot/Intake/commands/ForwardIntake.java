// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Intake.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ForwardIntake extends CommandBase {
  /** Creates a new ForwardIntake. */
  private boolean extended;

  public ForwardIntake() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.INTAKESUB);
    this.extended = true;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(extended){
      Robot.INTAKESUB.extendo();
    }
    else{
      Robot.INTAKESUB.retractoyo();
    }
   
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
