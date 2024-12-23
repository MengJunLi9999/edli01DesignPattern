package org.edli01.solid.ocp;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.ocp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 16:01
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Ocp {
    public static void main(String[] args) {
        ShoppingStore shoppingStore = new ShoppingStore();

        System.out.println("Payment methods supported by the store.");
        for(IPayment payment : shoppingStore.getPaymentList()) {
            System.out.println(payment.pay());
        }
    }
}
