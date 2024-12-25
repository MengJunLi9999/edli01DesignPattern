package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Facade class for home theater system
 */
public class HomeTheaterFacade {
  private Amplifier amp;
  private DVDPlayer dvd;
  private Projector projector;
  private TheaterLights lights;

  public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, 
                          Projector projector, TheaterLights lights) {
    this.amp = amp;
    this.dvd = dvd;
    this.projector = projector;
    this.lights = lights;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    lights.dim(10);
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDVD();
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    lights.on();
    dvd.stop();
    dvd.eject();
    dvd.off();
    amp.off();
    projector.off();
  }
} 