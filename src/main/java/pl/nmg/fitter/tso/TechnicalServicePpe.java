package pl.nmg.fitter.tso;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;
import pl.nmg.fitter.InkasentAdress;
import pl.nmg.fitter.OrigAmiDevices;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class TechnicalServicePpe {

  private String ppeName;
  private String ppeCode;
  private String ppePremisesPurpose;
  private String tariffGroup;
  private InkasentAdress deviceAddress;
  private InkasentAdress ownerAddress;
  private InkasentAdress buildingAdministratorAddress;
  private String description;
  private OrigAmiDevices devices = new OrigAmiDevices();
}
