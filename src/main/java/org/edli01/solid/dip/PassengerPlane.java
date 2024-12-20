package org.edli01.solid.dip;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.dip
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 00:47
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class PassengerPlane implements ITFPlane {
    @Override
    public void flight() {
        System.out.println("The passenger plane begins flying.");
    }
}
