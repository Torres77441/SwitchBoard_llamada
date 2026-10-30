public class Exercise5 {
    public static void main(String[] args) {
        Switchboard centralita = new Switchboard(1000);
        centralita.registerCall(new Llamada("555-5441" , "965-8851" , 30 , 1 , true));
        centralita.registerCall(new Llamada("555-2245" , "965-84454" , 100 , 3 , false));
        centralita.registerCall(new Llamada("555-96318" , "965-5229" , 250 , 1 , false));
        centralita.registerCall(new Llamada("555-52007" , "965-4112" , 301 , 2 , true));
        System.out.println("Numero total de llamadas: " + centralita.getNumCalls());
        System.out.println("Coste total de las llamadas: " +centralita.getTotalCost());
    }
}
