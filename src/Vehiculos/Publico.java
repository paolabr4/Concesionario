package Vehiculos;

import Vehiculos.tipos.TipoMarca;
import Vehiculos.tipos.TipoPublico;

public class Publico extends Vehiculo{

    public Publico(TipoMarca marca, int modelo, String placa, String color, int precio, int numeroPlanilla, TipoPublico tipoPublico) {
        super(marca, modelo, placa, color, precio);
        this.numeroPlanilla = numeroPlanilla;
        this.tipoPublico = tipoPublico;
    }

    private  int numeroPlanilla;
    private TipoPublico tipoPublico;

    public int getNumeroPlanilla() {
        return numeroPlanilla;
    }

    public void setNumeroPlanilla(int numeroPlanilla) {
        this.numeroPlanilla = numeroPlanilla;
    }

    public TipoPublico getTipoPublico() {
        return tipoPublico;
    }

    public void setTipoPublico(TipoPublico tipoPublico) {
        this.tipoPublico = tipoPublico;
    }


}
