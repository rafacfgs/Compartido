package tareaDeClaseTerceraEvaluacion;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	public int getDia()	{
	      // retorna el valor de la variable dia
	return dia;
	}
	public void setDia(int dia){
	      // asigna el valor del parametro a la variable dia 
	this.dia = dia;
	}
	public int getMes()	{
	return mes;
	}
	public void setMes(int mes)	{
	this.mes = mes;
	}
	public int getAnio() {
	return anio;
	}
	public void setAnio(int anio) {
	this.anio = anio;
	}
	public String toString() 	{
	      // retorna una cadena tal como queremos que se vea la fecha
	return dia+"/"+mes+"/"+anio;
	}
	public boolean equals(Object o)	{
	Fecha otra = (Fecha)o;
	return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
	}
	public Fecha(int d, int m, int a){
	dia = d;
	mes = m;
	anio = a;
	}
	
	   // constructor sin argumentos 
	   public Fecha()
	{
	}
	public Fecha(String s)	{
	      // busco la primera ocurrencia de '/'
	int pos1=s.indexOf("/");
	      // busco la ultima ocurrencia de '/'
	int pos2=s.lastIndexOf("/");
	      // proceso el dia
	String sDia=s.substring(0,pos1);
	dia = Integer.parseInt(sDia);
	      // proceso el mes
	String sMes=s.substring(pos1+1,pos2);
	mes = Integer.parseInt(sMes);
	      // proceso el anio
	String sAnio = s.substring(pos2+1);
	anio = Integer.parseInt(sAnio);
	}
	private int fechaToDias(){
	      // no requiere demasiada explicacion...
	return anio*360+mes*30+dia;
	}
	
	private void diasToFecha(int i)	{
	      // dividimos por 360 y obtenemos el anio
	anio = (int)i/360;
	      // del resto de la division anterior 
	      // podremos obtener el mes y el dia
	int resto = i % 360;
	      // el mes es el resto dividido 30
	mes = (int) resto/30;
	      // el resto de la division anterior son los dias
	dia = resto % 30;
	      // ajuste por si dia quedo en cero
	if( dia == 0)
	{
	dia=30;
	mes--;
	}
	      // ajuste por si el mes quedo en cero
	if( mes == 0)
	{
	mes=12;
	anio--;
	}
	}
	
	public void addDias(int d)
	{
	      // convierto la fecha a dias y le sumo d
	int sum=fechaToDias()+d;
	      // la fecha resultante (sum) la separo en dia, mes y anio
	diasToFecha(sum);
	}
	}

