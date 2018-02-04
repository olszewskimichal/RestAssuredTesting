package pl.nmg.fitter.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class InkasentAPKVersion {

  private int version;
  private Date imported;
  private String guiVersion;
  private String md5Control;
  private String sha256Control;
  private String filename;

}
