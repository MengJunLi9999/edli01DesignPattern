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
public abstract class AScout {
    protected IExcellentHitter iExcellentHitter = null;
    protected IExcellentPitching iExcellentPitching = null;

    public AScout(IExcellentHitter iExcellentHitter) {
        this.iExcellentHitter = iExcellentHitter;
    }

    public AScout(IExcellentPitching iExcellentPitching) {
        this.iExcellentPitching = iExcellentPitching;
    }

    public abstract void display();
}
