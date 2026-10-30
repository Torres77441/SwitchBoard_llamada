import java.util.Arrays;

public class Llamada {
    private String num_origin;
    private String num_dest;
    public int total_time;
    private int banda;
    private boolean local;
    private int PRECIOBANDALOCAL = 15;
    private int PRECIOBANDA1 = 20;
    private int PRECIOBANDA2 = 25;
    private int PRECIOBANDA3 = 30;

    public Llamada(String num_origin, String num_dest, int total_time, int banda, boolean local) {
        this.num_origin = num_origin;
        this.num_dest = num_dest;
        this.total_time = total_time;
        this.banda = banda;
        this.local = local;
    }

    @Override
    public String toString() {
        String tipo;
        if(local){
            tipo = "local";
        }else{
            tipo = "Provincial";
        }
        return "Origen : " + num_origin + " | Destino = " + num_dest + " | Duracion = " + total_time + "| Banda = " + banda + " | Tipo= " + tipo;
    }

    public int getCost(){
        if(local){
            return  PRECIOBANDALOCAL * total_time;
        }else{
            if (banda == 1 ){
                return total_time * PRECIOBANDA1;
            }else if (banda == 2 ){
                return total_time * PRECIOBANDA2;
            }else {
                return total_time * PRECIOBANDA3;
            }
        }

    }
}
