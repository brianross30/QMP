package domain.prenda;

import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas;

    public void agregarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public Atuendo generarAtuendo(){
        //TODO
        return new Atuendo();
    }
}
