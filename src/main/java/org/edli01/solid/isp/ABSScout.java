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
public abstract class ABSScout {
    protected ITFExcellentHitter itfExcellentHitter = null;
    protected ITFExcellentPitching itfExcellentPitching = null;

    public ABSScout(ITFExcellentHitter itfExcellentHitter) {
        this.itfExcellentHitter = itfExcellentHitter;
    }

    public ABSScout(ITFExcellentPitching itfExcellentPitching) {
        this.itfExcellentPitching = itfExcellentPitching;
    }

    public abstract void display();
}
