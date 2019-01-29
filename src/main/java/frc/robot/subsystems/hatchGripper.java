/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.teleop_gripper;

/**
 * Add your docs here.
 */
public class hatchGripper extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //public static Solenoid gripperSolenoid;
  //public static DigitalInput gripperSwitch1;
  //public static DigitalInput gripperSwitch2;
  public static boolean isOpen = false;
  public static boolean hasHatch = false;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new teleop_gripper());
  }

  public void setupGripper(){
  //  gripperSolenoid = RobotMap.gripperSolenoid;
    //gripperSolenoid.set(false);
    //gripperSwitch1 = RobotMap.gripperSwitch1;
    //gripperSwitch2 = RobotMap.gripperSwitch2;
    isOpen = false;
  }

  public void controlGripper(){

    //if(gripperSwitch1.get() == false && gripperSwitch2.get() == false && isOpen == false){
      //hasHatch = true;
    //}else if(gripperSwitch1.get() == true && gripperSwitch2.get() == true && isOpen == true){
      //hasHatch = false;
    //}

    //if(hasHatch == false && isOpen == true){
      //if(OI.driveController.getRawButton(2) == true || (gripperSwitch1.get() == false && gripperSwitch2.get() == false)){
        //gripperSolenoid.set(false);
        //isOpen = false;
      //}

    //}else if(hasHatch == true && isOpen == false){
      //if(OI.driveController.getRawButton(3) == true){
        //gripperSolenoid.set(true);
        //isOpen = true;
      //}
    //}else if(hasHatch == false && isOpen == false){
     //if(OI.driveController.getRawButton(3) == true){
       //gripperSolenoid.set(true);
        //isOpen = true;
      //}
    //}

    System.out.println(hasHatch);
    //if(gripperSwitch1.get() == false){
      //System.out.println("Switch 1 Pressed");
    //}
    
    //if(gripperSwitch2.get() == false){
      //System.out.println("Switch 2 Pressed");
    //}
      
  }


}
