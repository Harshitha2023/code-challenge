package com.test.toyrobot.model;

public class Robot {

    public static final Integer MAX_POSITION = 4;
    public static final Integer MIN_POSITION = 0;

    private Integer xPosition;

    private Integer yPosition;

    private Direction direction;

    private Integer activeRobotId;

    public Robot() {
    }

    public Robot(Integer xPosition, Integer yPosition, Direction direction, Integer activeRobotId) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
        this.activeRobotId = activeRobotId;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isOnTable() {
        return xPosition != null && yPosition != null && direction != null;
    }

    public String getCurrentStatus() {
        return String.join(",", xPosition.toString(), yPosition.toString(), direction.toString());
    }

    public Integer getActiveRobotId() {
        return activeRobotId;
    }

    public void setActiveRobotId(final Integer activeRobotId) {
        this.activeRobotId = activeRobotId;
    }

    public void increaseYPosition() {
        yPosition++;
    }

    public void decreaseYPosition() {
        yPosition--;
    }

    public void increaseXPosition() {
        xPosition++;
    }

    public void decreaseXPosition() {
        xPosition--;
    }
}
