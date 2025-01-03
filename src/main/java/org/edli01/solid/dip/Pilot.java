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
public class Pilot implements IPilot {
    @Override
    public void fly(IPlane iPlane) {
        iPlane.flight();
    }
}
