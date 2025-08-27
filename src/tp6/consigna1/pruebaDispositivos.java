package tp6.consigna1;

public class pruebaDispositivos {


        public static void main(String[] args) {
            televisor Televisor= new televisor("Televisor");
            camara Camara= new camara("Camara");
            lampara Lampara= new lampara("Lampara");

            //tp1.consigna1.lampara
            System.out.println("------LAMPARA--------");
            Lampara.apagar();
            Lampara.encender();
            Lampara.apagar();
            Lampara.encender();
            Lampara.apagar();
            Lampara.apagar();
            System.out.println(Lampara.historial);
            System.out.println("ESTADO ACTUAL " + Lampara.obtenerEstado());


            //tp1.consigna1.televisor
            System.out.println("------TELEVISOR--------");
            Televisor.apagar();
            Televisor.encender();
            Televisor.encender();
            Televisor.apagar();
            Televisor.encender();
            System.out.println(Televisor.historial);
            System.out.println("ESTADO ACTUAL " + Televisor.obtenerEstado());


            //tp1.consigna1.camara
            System.out.println("------CAMARA--------");
            Camara.encender();
            Camara.apagar();
            Camara.encender();
            Camara.apagar();
            System.out.println(Camara.historial);
            System.out.println("ESTADO ACTUAL " + Camara.obtenerEstado());


        }
 }



