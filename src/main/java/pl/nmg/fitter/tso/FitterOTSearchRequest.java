package pl.nmg.fitter.tso;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class FitterOTSearchRequest {

  private Long fitter;
  private Date dateForm;
  private Date dateTo;
  private boolean finished;

}
