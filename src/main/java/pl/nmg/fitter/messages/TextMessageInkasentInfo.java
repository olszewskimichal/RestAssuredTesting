package pl.nmg.fitter.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;
import pl.nmg.fitter.InkasentInfoPriority;
import pl.nmg.fitter.WebsocketInkasentInfoBase;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class TextMessageInkasentInfo extends WebsocketInkasentInfoBase {

  public static final String DISC_VAL = "text-message";
  private InkasentInfoPriority priority;
  private String message;

}
