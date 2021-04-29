package domain.prenda;

public class Prenda {
    private String tipo;
    private Categorias categoria;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda(String tipo, Categorias categoria, String material, String colorPrimario){
        if(tipo != null || categoria != null || material != null || colorPrimario != null){
            this.tipo = tipo;
            this.categoria = categoria;
            this.material = material;
            this.colorPrimario = colorPrimario;
        }
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}



// atuendo: combinacion de prendas
// el guardarropas tiene prendas, el sistema genera atuendos (el guardarropas o QMP?)


// prenda:
/*
    *tipo de prenda [string]
    * categoría [ENUM]
    * tela o material [string]
    * color principal [string?]
    * color secundario [string?]
    * evitar que haya prendas sin tipo, tela, categoría o color primario
    * evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado) - no pude resolver este punto
 */