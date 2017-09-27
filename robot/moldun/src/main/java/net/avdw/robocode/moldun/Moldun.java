package net.avdw.robocode.moldun;

import robocode.AdvancedRobot;

public class Moldun extends AdvancedRobot {

    @Override
    public void run() {
        System.out.println("no poop!");
        setAdjustRadarForRobotTurn(false);
        while (true) {
            setTurnRadarRight(45);
            System.out.println("another poop!");
            setTurnLeft(45);
            execute();
        }
    }

}
