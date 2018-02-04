package pl.nmg.fitter.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class OnStartAplicationConfig {

  private String firstname;
  private String lastname;
  private Long userId;
  private Long inkasent;
  private Long monter;
  private Long gpsPositionInterval;
  private Long gpsReadTooOld;
  private Long gpsReadTooFar;
  private Integer repeatOpticalInterfaceBeforeInkasentEnabled;
  private Integer maxWebsocketMessageBufferSize;
  private List<InkasentDictionaryElement> flaws;
  private List<InkasentDictionaryElement> counterStatuses;
  private List<InkasentDictionaryElement> readStatuses;
  private List<InkasentDictionaryElement> deviceStatuses;
  private InkasentAPKVersion latestAPK;

}
