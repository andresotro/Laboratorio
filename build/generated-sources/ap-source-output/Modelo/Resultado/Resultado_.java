package Modelo.Resultado;

import Modelo.Bacteriologa.Bacteriologa;
import Modelo.Paciente.Paciente;
import Modelo.Parametro.Parametro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Resultado.class)
public class Resultado_ { 

    public static volatile SingularAttribute<Resultado, Bacteriologa> iDBacteriologa;
    public static volatile SingularAttribute<Resultado, Paciente> iDPaciente;
    public static volatile SingularAttribute<Resultado, Date> fechaRealizacion;
    public static volatile SingularAttribute<Resultado, Integer> valor;
    public static volatile SingularAttribute<Resultado, Integer> iDResultado;
    public static volatile SingularAttribute<Resultado, Parametro> iDParametro;

}