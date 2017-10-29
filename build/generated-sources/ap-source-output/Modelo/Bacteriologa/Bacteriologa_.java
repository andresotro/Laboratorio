package Modelo.Bacteriologa;

import Modelo.Resultado.Resultado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Bacteriologa.class)
public class Bacteriologa_ { 

    public static volatile SingularAttribute<Bacteriologa, Integer> iDBacteriologa;
    public static volatile SingularAttribute<Bacteriologa, String> password;
    public static volatile SingularAttribute<Bacteriologa, String> apellido;
    public static volatile SingularAttribute<Bacteriologa, String> usuario;
    public static volatile SingularAttribute<Bacteriologa, Long> identificacion;
    public static volatile SingularAttribute<Bacteriologa, String> nombre;
    public static volatile CollectionAttribute<Bacteriologa, Resultado> resultadoCollection;

}