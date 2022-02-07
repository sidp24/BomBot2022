package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.*;
import edu.wpi.first.wpilibj2.command.*;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import static frc.robot.Constants.*;

public class RobotContainer {

    // Subsystems (driver train, and other manipulators)
    private final DriveTrain m_drive = new DriveTrain();
/*    private final Hanger m_hanger = new Hanger();
 */
    //private final TestMotor testMotor = new TestMotor();

<<<<<<< Updated upstream
// privete final for intake
private final Intake m_intake = new Intake();

=======
    // privete final for intake
    private final Intake m_intake = new Intake();
    private final arm m_arm = new arm();
>>>>>>> Stashed changes
    // Controllers (input devices)
    // Set the port accordingly if you have multiple USB input devices
    final Joystick gamePad = new Joystick(1);
    final Joystick logi = new Joystick(0);
   

    // command for autonomous mode
    // private final Command m_autoCommand = new AutoPortDeploy(m_drive, m_intake, AUTO_PORT_DEPLOY_TIME, AUTO_PORT_DEPLOY_SPEED);

    public RobotContainer() {
        
        // set the default command for the drive train
         m_drive.setDefaultCommand(
                new RunCommand(
                        () -> m_drive.drive(DRIVE_SPEED_MULTIPLIER * -logi.getY() * logi.getThrottle(),
                                DRIVE_SPEED_MULTIPLIER * 0.75 * logi.getTwist() * Math.abs(logi.getThrottle())),
                        m_drive));  
       

        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by instantiating a {@link GenericHID} or one of its subclasses
     * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
     * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {

        // Gamepad Buttons to ID

        // Buttons
        final Button btnOut = new JoystickButton(gamePad, BUMP_RIGHT); // Right bumper
        final Button btnIn = new JoystickButton(gamePad, BUMP_LEFT); // Left bumper
        final Button btnHangEx = new JoystickButton(gamePad, BTN_Y); // Y
        final Button btnHangRet = new JoystickButton(gamePad, BTN_B); // B
        final Button btnArmDown = new JoystickButton(gamePad, BTN_A); // A
        final Button btnArmUp = new JoystickButton(gamePad, BTN_X); // X

        // Gamepad control
        btnOut.whenPressed(new intakeOut(m_intake, () -> (!btnOut.get())));
        btnIn.whenPressed(new IntakeIn(m_intake, () -> (!btnIn.get())));


    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // return m_autoCommand;
        return null;
    }
}
