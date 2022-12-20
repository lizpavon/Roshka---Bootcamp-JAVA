package Reloj;

public class Horario {
    double hora;
    double min;
    double seg;

    //por defecto (sin parametros; inicializa la hora a las 12:00:00
    public Horario() {
        //   hora = 12;
        //   min = 00;
        //   seg = 00;
    }

    //un constructor con 3 parametros: horas, minutos, segundos
    public Horario (double hora, double min, double seg){
    }

    //un constructor con 1 parametro: el valor del tiempo en segundos desde la medianoche (debe ser convertido en los
    //valores horas, minutos y segundos
    /*Hay otra forma de hacer que es hallo mi hora con tiempo/3600 y para hallar los minutos ya le tengo que sacar las horas
     */
    public Horario (double tiempo){
        double auxMin; double auxSeg;

        this.hora = tiempo/3600d;

        auxMin = hora % 1;
        this.min = (auxMin*60);

        auxSeg = min%1;
        seg = (auxSeg*60);

        hora = (Math.round(hora));
        min = (Math.round(min));
        seg = (Math.round(seg));
    }

    //metodo getHoras(), getMinutos(), getSegundos(), que retornan los valores correspondientes
    public double getHora() {
        return hora;}

    public double getMin() {
        return min;}

    public double getSeg() {
        return seg;}


    //metodo setHoras(), setMinutos(), setSegundos(),reciben 1 parametro, que setean las correspondientes instancias de variables
    public void setHora(double hora) {
        this.hora = hora;}
    public void setMin(double min) {
        this.min = min;}
    public void setSeg(double seg) {
        this.seg = seg;}


    //metodo tick(), este debe incrementar el tiempo de los segundos en 1
    public void tick(){
        while (seg < 59){
            seg = seg + 1;
        }
        if (seg == 59){
            seg = 0;
        }
    }

    //metodo addReloj() acepta un parametro del tipo Reloj. El metodo debe agregar la hora representada por el objeto en la clase actual.
    public void addReloj(Horario reloj){
        hora = hora + reloj.hora;
        if (hora > 24){
            hora = Math.abs(24-hora);
        }

        min = min + reloj.min;
        if (min > 59) {
            min = Math.abs(60 - min);
        }

        seg = seg + reloj.seg;
        if (seg > 59) {
            seg = Math.abs(60 - seg);
        }
    }

    //metodo toString(). Debe retornar un String representando
    //el objeto Reloj en el formato "[hh:mm:ss]", por ejemplo "[22:32:12]"
    @Override
    public String toString() {
        return "Horario{" +
                "hora=" + hora +
                ", min=" + min +
                ", seg=" + seg +
                '}';
    }

    //metodo restaReloj() que toma un parametro tipo Reloj y returna la diferencia de tiempo representada en el objeto de
    //reloj actual y el representado en el parametro.
    public void restaReloj(Horario reloj){
        hora = Math.abs(hora - reloj.hora);
        min = Math.abs(min - reloj.min);
        seg = Math.abs(seg - reloj.seg);
    }

    public static void main(String[] args) {
        //Horario x = new Horario(5000);
        Horario prueba = new Horario();
        prueba.setHora(24);
        prueba.setMin(59);
        prueba.setSeg(59);
        System.out.println("Hora reloj 1: " + prueba);

        Horario y = new Horario();
        y.setHora(1);
        y.setMin(1);
        y.setSeg(1);
        System.out.println("Hora reloj 2: " + y);

        //y.addReloj(prueba);
        //System.out.println("La suma de los relojes: " + y);

        //y.restaReloj(prueba);
        //System.out.println("La resta de los relojes cargado en el reloj 2: " + y);
    }
}