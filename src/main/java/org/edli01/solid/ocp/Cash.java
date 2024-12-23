package org.edli01.solid.ocp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.ocp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 15:46
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Cash implements IPayment {
    public String pay() {
        return "Choose cash payment.";
    }
}
