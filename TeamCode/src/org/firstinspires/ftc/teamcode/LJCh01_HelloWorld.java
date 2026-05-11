package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name = "LJCH01 Hello World") // This is the most important line!
public class LJCh01_HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","World");


    }

    @Override
    public  void loop(){


    }
}