package pl.nmg.fitter.tso;

import lombok.Getter;

@Getter
public enum TechnicalServiceOrderType {

  OGLĘDZINY(1l),
  SPRAWDZENIE(2l),
  DEMONTAŻ(3l),
  MONTAŻ(4l),
  WYMIANA(5l),
  OPLOMBOWANIE(6l),
  ODCZYT(7l),
  WINDYKACJA(8l),
  LEGALIZACJA(9l),
  SERWIS(10l);

  private long value;

  private TechnicalServiceOrderType(long value) {
    this.value = value;
  }

}
