package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (robot.getX() > toX) {
                    robot.stepForward();
                }
            }
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
                while (robot.getX() < toX) {
                    robot.stepForward();
                }
            }
        }
        if (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            }
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }

        }


    }
}
