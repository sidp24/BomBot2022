package frc.robot.commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.subsystems.TestMotor;

public class TestGoBack extends WaitUntilCommand {
    /**
     * Creates a new Hang.
     */
  
    private TestMotor testMotor;
  
    public TestGoBack(TestMotor subsystem, BooleanSupplier btnState) {
      super(btnState);
      addRequirements(subsystem);
      testMotor = subsystem;
      // Use addRequirements() here to declare subsystem dependencies.
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        testMotor.backward();
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      testMotor.stop();
    }
  }