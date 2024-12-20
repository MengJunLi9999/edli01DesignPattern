package org.edli01.oop.inheritance;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.inheritance
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 15:48
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Music {
    private String name;

    public Music(String name) {
        this.name = name;
    }

    public void arrangementOrPlay() {
        System.out.println(name + " arrangement");
    }

    public String getName() {
        return this.name;
    }
}
