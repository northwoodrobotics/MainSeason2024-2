package frc.robot.subsystems;

import static frc.robot.Constants.*;


import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.GenericHID;


public class Intake extends SubsystemBase {
  private final TalonFX m_intakeMotor = new TalonFX(rightShooterID);

  /** Creates a new Intake. */
  public Intake() {
    

    m_intakeMotor.getConfigurator().apply(new TalonFXConfiguration());

    m_intakeMotor.setInverted(true);
    
  }

  
  public void move(double pwr) {
   
    m_intakeMotor.set(pwr);

  }


 
  public void stop() {
    m_intakeMotor.stopMotor();;
  }

 
}