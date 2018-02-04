package pl.nmg.fitter;

import lombok.Getter;

@Getter
public enum InkasentInfoPriority {

  LOW(0, "Niska ważność."),
  NORMAL(1, "Normalna ważność"),
  HIGH(2, "Wysoka ważność");

  private int value;
  private String desc;

  private InkasentInfoPriority(int value, String desc) {
    this.value = value;
    this.desc = desc;
  }
}
