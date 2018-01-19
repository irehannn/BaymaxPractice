package org.usfirst.frc.team687.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	Talon frcPractice;
	Talon frcPractice1;
	Talon frcPractice2;
	Talon frcPractice3;
	//declaring a motor
	//talon is a motor control, others include TalonSRX

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	//public drive is where you instantiate motors to restrain from making multiple motors
public Drive() {
	frcPractice = new Talon(0);
	frcPractice1 = new Talon(1);
	frcPractice2 = new Talon(2);
	frcPractice3 = new Talon(3);
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//public void is a method but functions as a command
    }
	public void tankDrive (double leftPower, double rightPower) {
		frcPractice.set(leftPower);
		frcPractice1.set(rightPower);
		frcPractice2.set(leftPower);
		frcPractice3.set(rightPower);
		//motor.set is the defining the amount of power
		//public void is a command
		//two motors has to have a power of each direction
		//forward is -1, left is -1, right and back is 1
	}
}

