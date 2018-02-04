package pl.nmg.fitter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;
import pl.nmg.fitter.messages.TextMessageInkasentInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "information")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TextMessageInkasentInfo.class, name = TextMessageInkasentInfo.DISC_VAL)
})
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public abstract class WebsocketInkasentInfoBase {

  private String information;
  private Long messageId;

}
