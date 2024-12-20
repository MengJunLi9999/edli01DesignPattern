package org.edli01.oop.inheritance;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.inheritance
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 15:53
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class PopMusic extends Music {
    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void arrangementOrPlay() {
        System.out.println("Play " + super.getName() + "'s pop music");
    }
}
