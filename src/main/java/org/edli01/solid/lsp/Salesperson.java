package org.edli01.solid.lsp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.lsp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 15:13
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Salesperson {
    private ABSPhone absPhone;

    public void setAbsPhone(ABSPhone absPhone) {
        this.absPhone = absPhone;
    }

    public void startWorking() {
        System.out.println("Start working.");
        absPhone.sell();
    }
}
