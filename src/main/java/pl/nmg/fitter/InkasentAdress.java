package pl.nmg.fitter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
public class InkasentAdress {

  private String street;
  private String city;
  private String district;
  private String postCode;
  private String houseNum;
  private String apartmentNum;
  private String parcelNum;
  private String description;
  private Double latitude;
  private Double longitude;
}
