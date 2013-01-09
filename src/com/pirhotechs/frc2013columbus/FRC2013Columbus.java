/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.pirhotechs.frc2013columbus;


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
    double tempX;
    double tempY;
    public FRC2013Columbus() {
        joy1 = new Joystick(1);
        drivetrain = new RobotDrive(1,2);
    }
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while(isOperatorControl() && isEnabled()) {
            if(Math.abs(joy1.getX()) > .2) {
                tempX = joy1.getX();
            } else {
                tempX = 0;
            }
            
            if(Math.abs(joy1.getY()) > .2) {
                tempY = joy1.getY();
            } else {
                tempX = 0;
            }
            
            
            drivetrain.arcadeDrive(tempY, tempX);
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
