package pl.nmg.fitter.tso;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class FitterTechnicalServiceOrder {

  private Long fitter;
  private Long technicalServiceId;
  private TSOKind kind;
  private String description;
  private TechnicalServiceOrderType taskType;
  private Date created;
  private TechnicalServiceExecutinTime executionTime;
  private TechnicalServiceOrderPriority priority;
  private List<Long> activitiesGroup = new ArrayList<>();
  private TechnicalServicePpe ppe;

}
