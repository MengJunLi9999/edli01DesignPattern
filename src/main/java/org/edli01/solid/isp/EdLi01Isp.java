package org.edli01.solid.isp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.isp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 00:56
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Isp {
    public static void main(String[] args) {
        ITFExcellentHitter edli01Player = new TwoWayPlayer("edli01");
        ABSScout scout = new Scout(edli01Player);
        scout.display();
    }
}
