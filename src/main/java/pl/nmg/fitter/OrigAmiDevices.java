package pl.nmg.fitter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class OrigAmiDevices {

  private List<OrigAmiMeter> meters = new ArrayList<>();
  private List<InkasentOtherDevice> otherDevices = new ArrayList<>();
}
