package com.Robot4461.practice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class Robot extends IterativeRobot {
	
	RobotDrive chassis;
	Joystick batonGauche;
	Joystick batonDroit;
	Joystick baton;       //Neutral joy stick for arcade drive
	
	JoystickButton gachetteGauche;
	JoystickButton gachetteDroite;
	
    public void robotInit() {
    	chassis = new RobotDrive(0, 1, 2, 3);
    	batonGauche = new Joystick(1);
    	batonDroit = new Joystick(2);
    	baton = new Joystick(1);
    	
    	gachetteGauche = new JoystickButton(batonGauche, 1);
    	gachetteDroite = new JoystickButton(batonDroit,  1);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	chassis.tankDrive(-batonGauche.getY(), -batonDroit.getY());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    		chassis.arcadeDrive(baton);
    }
    
}
