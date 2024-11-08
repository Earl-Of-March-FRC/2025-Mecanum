// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class DrivetrainConstants {

    // Motor controller ID
    public static final int frontLeftID = 1;
    public static final int frontRightID = 3;
    public static final int backLeftID = 2;
    public static final int backRightID = 4;

    public static final double distanceTolerance = 1;

    public static final double kP = 0;
    public static final double kI = 0;
    public static final double kD = 0;

    // kp 0.2
    public static final double kPVerticalDrive = 0.005;
    public static final double kIVerticalDrive = 0;
    public static final double kDVerticalDrive = 0.0002;

    public static final double kPHorizontalDrive = 0.01;
    public static final double kIHorizontalDrive = 0;
    public static final double kDHorizontalDrive = 0;

    public static final double balanceTolerance = 10;

    public static final double kPBalance = 0.1;
    public static final double kIBalance = 0;
    public static final double kDBalance = 0;
    public static final double dropAndLeaveSetpoint = 12;

    public static double maxDriveSpeed = 0.5;
    public static double maxTurnSpeed = 0.4;
  }

  public static class ArmConstants {

    public static final int extension1 = 9; // left
    public static final int incline1 = 0;
    public static final int incline2 = 6;
    public static final int claw = 7;

    public static final int conePlaceTopExtend = 30;
    public static final double conePlaceTopIncline = 34;

    public static final int conePlaceMidExtend = 85;
    public static final int conePlaceMidIncline = 38;

    public static final int conePlaceLowExtend = 45;
    public static final int conePlaceLowIncline = 38;

    public static final int armMaxAngle = 43;
    public static final int minAngleAtMaxArmOut = 30;
  }
  // among us - Alex Z
  public static class OperatorConstants {

    public static final int kDriverControllerPort = 0;
    public static final int forwardAxis = 1;
    public static final int sideAxis = 4;
    public static final int rotationAxis = 0;
    public static final int cubePickUpButton = 3;
    public static final int conePickUpButton = 3;
    public static final int cubePlaceTopButton = 3;
    public static final int conePlaceTopButton = 3;
    public static final int cubeLineUpButton = 3;
    public static final int coneLineUpButton = 3;

    public static int scaleAxis = 3;
  }

  public static class VisionConstants {
    public static final double topTapeHeight = 106; // this is in cm
    public static final double aprilTagHeight = 69; // this is in cm

    public static final double cameraAngle = 0;

    public static final double cameraHeight = 0;

    public static final double distanceTarget = 20;

    public static final int conePipeline = 0;
    public static final int cubePipeline = 1;
  }

  public static class GyroConstants {
    public static final double kPGyro = 0.02;
    public static final double kIGyro = 0.02;
    public static final double kDGyro = 0.0003;

    public static final double gyroTurnTolerance = 0.6;
  }

  public static class ScaleFactorConstants {
    public static double driveScaleFactor = 1;
    public static double turnScaleFactor = 0.8;

    public static final double driveDeadzone = 0.05;
    public static final double rotateDeadzone = 0.1;
  }

  // public static class GridConstants {
  //   public static final int conePlaceTopIncline =
  //       39; // this is in degrees, this value is from the math we did and it shoud be mostly
  // correct
  //   public static final int conePlaceTopExtension = 0;

  //   public static final int cubePlaceTopIncline = 0;
  //   public static final int cubePlaceTopExtension = 0;

  //   public static final int drop = 0;
  // }

  public static class DriverStationConstants {

    public static final int DriverStationController = 0;

    public static final int ArmExtendAxis = 5; // 5 for xbox
    public static final int ArmInclineAxis = 1;

    public static final int ClawCloseButton = 6;
    public static final int ClawOpenButton = 5;
  }

  public static class LEDConstants {
    public static final int LEDTalonPort = 0;
  }
}
