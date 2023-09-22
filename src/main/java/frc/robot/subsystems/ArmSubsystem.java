package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

  private TalonFX right2;

  //add motors here
  public ArmSubsystem() {
		right2 = new TalonFX(CanIds.rightFalcon2.id);
		
		right2.configFactoryDefault();
		right2.setInverted(true);
  }

  public TalonFX getRightFollow() {
    return right2;
  }


  public void setRightPower(double power) {
      right2.set(power);
  }
  
  @Override
  public void periodic() {

  }
}
