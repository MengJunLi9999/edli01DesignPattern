package org.edli01.solid.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.solid.ocp
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-19 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class ShoppingStore {
    private final static List<ITFPayment> paymentList = new ArrayList<ITFPayment>();

    static {
        paymentList.add(new Cash());
        paymentList.add(new CreditCard());
        paymentList.add(new MobilePay());
    }

    public List<ITFPayment> getPaymentList() {
        return this.paymentList;
    }
}
