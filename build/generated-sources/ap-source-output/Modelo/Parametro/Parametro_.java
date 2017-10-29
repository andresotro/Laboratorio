package Modelo.Parametro;

import Modelo.Examen.Examen;
import Modelo.Resultado.Resultado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T17:06:07")
@StaticMetamodel(Parametro.class)
public class Parametro_ { 

    public static volatile SingularAttribute<Parametro, String> descripcion;
    public static volatile SingularAttribute<Parametro, Integer> valorMaximo;
    public static volatile SingularAttribute<Parametro, Examen> iDExamen;
    public static volatile SingularAttribute<Parametro, Integer> valorMinimo;
    public static volatile SingularAttribute<Parametro, String> nombre;
    public static volatile SingularAttribute<Parametro, Integer> iDParametro;
    public static volatile CollectionAttribute<Parametro, Resultado> resultadoCollection;

}