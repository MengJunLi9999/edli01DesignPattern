package org.edli01.solid.dip;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.dip
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 00:52
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Dip {
    public static void main(String[] args) {
        ITFPilot edli01Pilot = new Pilot();
        ITFPlane fighter = new Fighter();
        edli01Pilot.fly(fighter);
    }
}
