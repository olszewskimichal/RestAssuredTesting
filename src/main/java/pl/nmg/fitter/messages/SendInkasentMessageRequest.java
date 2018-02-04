package pl.nmg.fitter.messages;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class SendInkasentMessageRequest {

  List<Long> inkasent;
  List<Long> fitter;
  Long infoPriority;
  String message;
  boolean doPersist = false;
}
