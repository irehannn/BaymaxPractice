package org.usfirst.frc.team687.robot.commands;

import org.usfirst.frc.team687.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDrive extends Command {

    public TankDrive() {
    	requires(Robot.drive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//initialize runs once
    	//teleop period joysticks
    	//autonomous moves by itself
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.tankDrive(Robot.m_oi.leftJoystick.getY(), Robot.m_oi.rightJoystick.getY());
    	//executes runs more than once
    	//arcade drive uses getX
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}