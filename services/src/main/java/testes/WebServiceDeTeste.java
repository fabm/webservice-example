package pt.testes;

import javax.jws.WebService;

@WebService(portName = "esteEOport",serviceName = "esteEOnome")
public class WebServiceDeTeste {

  public String getTeste(){
    return "ola mundo";
  }
}
