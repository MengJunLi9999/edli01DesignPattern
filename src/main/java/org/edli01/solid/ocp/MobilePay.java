package org.edli01.solid.ocp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.ocp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 15:47
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class MobilePay implements IMobilePay {
    public String pay() {
        return "Choose Mobile pay payment.";
    }

    public void identityVerification() {
        System.out.println("Perform identity verification before mobile payment.");
    }
}
