/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.pirhotechs.frc2013columbus;


import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class FRC2013Columbus extends SimpleRobot {
    Joystick joy1;
    RobotDrive drivetrain;
    Jaguar shooterMTR;
    double tempX;
    double tempY;
    public FRC2013Columbus() {
        joy1 = new Joystick(1);
        drivetrain = new RobotDrive(1,2);
        shooterMTR = new Jaguar(3);
    }
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()) {
            drivetrain.arcadeDrive(joy1);
            if(joy1.getRawButton(8)) {
                shooterMTR.set(1.0);
            } else {
                shooterMTR.set(0.0);
            }
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
