package frc.robot.commands;



import frc.robot.subsystems.Intake;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;


public class TeleIntake extends Command {

      private final Intake m_intake;
      private DoubleSupplier pwr;

 


  public TeleIntake(Intake m_intake, DoubleSupplier pwr) {

  
      this.m_intake = m_intake;
      this.pwr=pwr;
      addRequirements(m_intake);

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_intake.move(pwr.getAsDouble());
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // Always return false so the command never ends on it's own. In this project we use the
    // scheduler to end the command when the button is released.
    return false;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Stop the wheels when the command ends.
    m_intake.stop();
  }
}