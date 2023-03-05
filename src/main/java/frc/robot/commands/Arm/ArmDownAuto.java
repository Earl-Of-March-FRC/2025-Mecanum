// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Arm;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Arm;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ArmDownAuto extends InstantCommand {

  Arm armMotors;

  public ArmDownAuto(Arm armMotors) {
    this.armMotors = armMotors;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    armMotors.armIncline(-0.2);

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    armMotors.armIncline(0);
  }
}