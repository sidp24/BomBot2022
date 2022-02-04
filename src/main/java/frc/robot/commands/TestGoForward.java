package frc.robot.commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.subsystems.TestMotor;

public class TestGoForward extends WaitUntilCommand {
    /**
     * Creates a new Hang.
     */
  
    private TestMotor testMotor;
    private int logCount;
  
    public TestGoForward(TestMotor subsystem, BooleanSupplier btnState) {
      super(btnState);
      this.testMotor = subsystem;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(subsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
      System.out.println("...initialized");
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        if(logCount<10){
          System.out.println("....GoFwd executing " + ++logCount);
        }
        testMotor.forward();
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        System.out.println(" end, interrupted=" + interrupted);
      testMotor.stop();
      logCount=0;
    }
  }