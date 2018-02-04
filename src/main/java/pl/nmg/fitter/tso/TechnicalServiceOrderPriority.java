package pl.nmg.fitter.tso;


import lombok.Getter;

@Getter
public enum TechnicalServiceOrderPriority {
  LOWEST(0l, "Najniższy"),
  LOWER(1L, "Niższy"),
  NORMAL(2L, "Normalny"),
  HIGHER(3L, "Wyższy"),
  HIGHEST(4L, "Najwyższy");

  private Long priority;
  private String description;

  private TechnicalServiceOrderPriority(Long priority, String aDescription) {
    this.priority = priority;
    description = aDescription;
  }
}