package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {
	DcMotor frontLeft;
	DcMotor frontRight;
	DcMotor backLeft;
	DcMotor backRight;
	Servo testServo;

	final private static double ONE_METER = 4500; // guess and check lmao
	final static double ONE_CENTIMETER =  ONE_METER / 100;
	final private static double FULL_ROBOTATION = 8000;
	final static double ONE_DEGREE = FULL_ROBOTATION / 360;


	RobotHardware(HardwareMap hardwareMap){
		frontLeft = hardwareMap.get(DcMotor.class, "front_left");
		frontRight = hardwareMap.get(DcMotor.class, "front_right");
		backLeft = hardwareMap.get(DcMotor.class,"back_left");
		backRight = hardwareMap.get(DcMotor.class,"back_right");
		testServo = hardwareMap.get(Servo.class,"test_servo");

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
