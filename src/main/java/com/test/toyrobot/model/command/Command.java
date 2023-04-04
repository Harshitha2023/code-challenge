package com.test.toyrobot.model.command;


import com.test.toyrobot.model.Report;
import com.test.toyrobot.model.Robot;

public abstract class Command {

    public abstract void execute(Robot robot, Report report);
}
