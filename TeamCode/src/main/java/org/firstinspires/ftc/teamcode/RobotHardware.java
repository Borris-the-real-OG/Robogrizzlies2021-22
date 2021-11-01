package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
	DcMotor frontLeft;
	DcMotor frontRight;
	DcMotor backLeft;
	DcMotor backRight;

	RobotHardware(HardwareMap hardwareMap){
		frontLeft = hardwareMap.get(DcMotor.class, "front_left");
		frontRight = hardwareMap.get(DcMotor.class, "front_right");
		backLeft = hardwareMap.get(DcMotor.class,"back_left");
		backRight = hardwareMap.get(DcMotor.class,"back_right");

		frontRight.setDirection(DcMotor.Direction.FORWARD);
		frontLeft.setDirection(DcMotor.Direction.REVERSE);
		backLeft.setDirection(DcMotor.Direction.REVERSE);
		backRight.setDirection(DcMotor.Direction.FORWARD);

		frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
		backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

	}
}
