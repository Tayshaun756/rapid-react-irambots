/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.shooterManual;
//import frc.robot.commands.moveShooter;
//import frc.robot.commands.cellOutput;
import frc.robot.commands.fullShooter;
//import frc.robot.commands.cwRoller;
//import frc.robot.commands.intakeCell;
//import frc.robot.commands.cargoVert;
import frc.robot.commands.putDown;
//import frc.robot.commands.resetArmEncoder;
//import frc.robot.commands.ccwRoller;
import frc.robot.commands.armWest;
import frc.robot.commands.armEast;
import frc.robot.commands.armManual;
import frc.robot.commands.armRetract;
import frc.robot.commands.armUpLimited;
import frc.robot.commands.armDownLimited;
//import frc.robot.commands.armDownLimited;
import frc.robot.commands.hookEast;
import frc.robot.commands.hookWest;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

 public class RobotContainer {
   //controllers
   public final Joystick m_driver = new Joystick(1);
   public final Joystick m_arcade = new Joystick(0);
 
 
 public RobotContainer() {
//configures button bindings
configureButtonBindings();
 }

private void configureButtonBindings() {

//driver controller

//arm limited
new JoystickButton(m_driver, 11).whileTrue(new armUpLimited());
new JoystickButton(m_driver, 12).whileTrue(new armDownLimited());

//arm manual
new JoystickButton(m_driver, 9).whileTrue(new armManual());
new JoystickButton(m_driver, 10).whileTrue(new armRetract());

//shooter
new JoystickButton(m_driver, 3).whileTrue(new shooterManual());
new JoystickButton(m_driver, 5).whileTrue(new fullShooter());

//reverse shooter
new JoystickButton(m_driver, 4).whileTrue(new putDown());
new JoystickButton(m_driver, 6).whileTrue(new putDown());

//hanger controller

//small hooks
new JoystickButton(m_arcade, 3).whileTrue(new hookEast());
new JoystickButton(m_arcade, 4).whileTrue(new hookWest());

//big hook
new JoystickButton(m_arcade, 7).whileTrue(new armWest());
new JoystickButton(m_arcade, 8).whileTrue(new armEast());
}

public Joystick getjoy1() {
  return m_arcade;
}
public Joystick getjoy2() {
  return m_driver;
}}





/*
public class OI {
 
 

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.WhileTrue(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

public Joystick joy1;
public Joystick joy2;
public Joystick joy3;
public JoystickButton joystickButton1;
public JoystickButton joystickButton2;
public JoystickButton joystickButton3;
public JoystickButton joystickButton4;
public JoystickButton joystickButton5;
public JoystickButton joystickButton6;
public JoystickButton joystickButton7;
public JoystickButton joystickButton8;
public JoystickButton joystickButton9;
public JoystickButton joystickButton10;
public JoystickButton joystickButton11;
public JoystickButton joystickButton12;



public OI() {

//input port 1 button reading
//input a

  joy1 = new Joystick(0);
 JoystickButton btn1a = new JoystickButton(joy1, 1);
 JoystickButton btn2a = new JoystickButton(joy1, 2);
 JoystickButton btn3a = new JoystickButton(joy1, 3);
 JoystickButton btn4a = new JoystickButton(joy1, 4);
 JoystickButton btn5a = new JoystickButton(joy1, 5);
 JoystickButton btn6a = new JoystickButton(joy1, 6);
 JoystickButton btn7a = new JoystickButton(joy1, 7);
 JoystickButton btn8a = new JoystickButton(joy1, 8);
  JoystickButton btn9a = new JoystickButton(joy1, 9);
  JoystickButton btn10a = new JoystickButton(joy1, 10);
 JoystickButton btn11a = new JoystickButton(joy1, 11);
  JoystickButton btn12a = new JoystickButton(joy1, 12);

//input port 2 button reading
//input b

  joy2 = new Joystick(1);
  JoystickButton btn1b = new JoystickButton(joy2, 1);
  JoystickButton btn2b = new JoystickButton(joy2, 2);
  JoystickButton btn3b = new JoystickButton(joy2, 3);
  JoystickButton btn4b = new JoystickButton(joy2, 4);
  JoystickButton btn5b = new JoystickButton(joy2, 5);
  JoystickButton btn6b = new JoystickButton(joy2, 6);
  JoystickButton btn7b = new JoystickButton(joy2, 7);
  JoystickButton btn8b = new JoystickButton(joy2, 8);
  JoystickButton btn9b = new JoystickButton(joy2, 9);
  JoystickButton btn10b = new JoystickButton(joy2, 10);
  JoystickButton btn11b = new JoystickButton(joy2, 11);
  JoystickButton btn12b = new JoystickButton(joy2, 12);

  joy3 = new Joystick(2);
  JoystickButton btn1c = new JoystickButton(joy3, 1);
  JoystickButton btn2c = new JoystickButton(joy3, 2);
  JoystickButton btn3c = new JoystickButton(joy3, 3);
  JoystickButton btn4c = new JoystickButton(joy3, 4);
  JoystickButton btn5c = new JoystickButton(joy3, 5);
  JoystickButton btn6c = new JoystickButton(joy3, 6);
  JoystickButton btn7c = new JoystickButton(joy3, 7);
  JoystickButton btn8c = new JoystickButton(joy3, 8);
 //JoystickButton btn9c = new JoystickButton(joy3, 9);
 //JoystickButton btn10c = new JoystickButton(joy3, 10);
 //JoystickButton btn11c = new JoystickButton(joy3, 11);
 // JoystickButton btn12c = new JoystickButton(joy3, 12);

  


  btn1a.WhileTrue(new armUpLimited());
  btn2a.WhileTrue(new armDownLimited());
  btn3a.WhileTrue(new hookEast());
  btn4a.WhileTrue(new hookWest());
  btn5a.WhileTrue(new shooterManual());
  btn6a.WhileTrue(new fullShooter());
  btn7a.WhileTrue(new armWest());
  btn8a.WhileTrue(new armEast());
  btn9a.WhileTrue(new resetArmEncoder());
  btn10a.WhileTrue(new putDown());
  btn11a.WhileTrue(new armUpLimited());
  btn12a.WhileTrue(new armDownLimited());

//input port 2 button mapping

  btn1b.WhileTrue(new cargoVert());
  //btn1b.WhileTrue(new intakeCell());
  btn2b.WhileTrue(new armUpLimited());
  btn3b.WhileTrue(new shooterManual());
  btn4b.WhileTrue(new putDown());
  btn5b.WhileTrue(new fullShooter());
  btn6b.WhileTrue(new putDown());
  btn7b.WhileTrue(new hookEast());
  btn8b.WhileTrue(new hookWest());
  btn9b.WhileTrue(new armManual());
  btn10b.WhileTrue(new armRetract());
  btn11b.WhileTrue(new armUpLimited());
  btn12b.WhileTrue(new armDownLimited());

  btn1c.WhileTrue(new cargoVert());
  //btn1c.WhileTrue(new intakeCell());
  btn2c.WhileTrue(new armUpLimited());
  btn3c.WhileTrue(new armWest());
  btn4c.WhileTrue(new hookWest());
  btn5c.WhileTrue(new hookEast());
  btn6c.WhileTrue(new shooterManual());
  btn7c.WhileTrue(new armDownLimited());
  btn8c.WhileTrue(new armEast());

}

public Joystick getjoy1() {
  return joy1;
}
public Joystick getjoy2() {
  return joy2;
};

//public GenericHID getJoystick() {
	//return null;
//}

//public Object interpretHatState(Object joystick1, int i, int j, double d, double e) {
	//return null;
}

*/
