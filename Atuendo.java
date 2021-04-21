package domain.prenda;

import java.util.List;

public class Atuendo {
    private List<Prenda> prendas;

    public void agregarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }
}
