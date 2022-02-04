package frc.robot.subsystems;

import static frc.robot.Constants.*;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestMotor extends SubsystemBase {

  private final PWMVictorSPX victorPwmOne = new PWMVictorSPX(-1);
  
  // private final TalonSRX talon = new TalonSRX(HANGER_TALON_ID);

  public void forward() {
      victorPwmOne.set(-TEST_1_MAXSPEED);
  }

  public void backward() {
      victorPwmOne.set(TEST_1_MAXSPEED);
  }

  public void stop() {
    victorPwmOne.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
    
}
