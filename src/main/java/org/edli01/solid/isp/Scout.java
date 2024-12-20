package org.edli01.solid.isp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.isp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 01:25
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Scout extends ABSScout {
    public Scout(ITFExcellentHitter twoWayPlayer) {
        super(twoWayPlayer);
    }

    public Scout(ITFExcellentPitching twoWayPlayer) {
        super(twoWayPlayer);
    }

    @Override
    public void display() {
        System.out.println("Player ability information.");
        if(super.itfExcellentHitter != null) {
            super.itfExcellentHitter.hit();
            super.itfExcellentHitter.defense();
        }
        if(super.itfExcellentPitching != null)
            super.itfExcellentPitching.pitch();
    }
}
