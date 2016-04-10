package tareaDeClaseTerceraEvaluacion;

public class FechaDetallada extends Fecha
{
private static String meses[]={"Enero"
,"Febrero"
,"Marzo"
,"Abril"
,"Mayo"
,"Junio"
,"Julio"
,"Agosto"
,"Septiembre"
,"Octubre"
,"Noviembre"
,"Diciembre"};
public String toString()
{
return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
}
public FechaDetallada(String f)
{
super(f);
}
public FechaDetallada() {//constructor generado automaticamente por error en TestFechaDetallada
	// TODO Auto-generated constructor stub
}
}
