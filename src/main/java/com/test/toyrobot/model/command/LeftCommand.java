package com.test.toyrobot.model.command;

import com.test.toyrobot.model.Direction;
import com.test.toyrobot.model.Report;
import com.test.toyrobot.model.Robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeftCommand extends Command {

    private final Logger log = LoggerFactory.getLogger(LeftCommand.class);

    public void execute(Robot robot, Report report) {

        if (!robot.isOnTable()) {
            log.debug("Left command ignored");
        } else {
            switch (robot.getDirection()) {
                case NORTH:
                    robot.setDirection(Direction.WEST);
                    break;
                case SOUTH:
                    robot.setDirection(Direction.EAST);
                    break;
                case EAST:
                    robot.setDirection(Direction.NORTH);
                    break;
                case WEST:
                    robot.setDirection(Direction.SOUTH);
                    break;
            }
            log.debug("The robot is rotating 90 degree to " + robot.getDirection());
        }

    }
}
