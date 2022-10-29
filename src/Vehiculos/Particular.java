package Vehiculos;

import Vehiculos.tipos.TipoMarca;

public class Particular extends Vehiculo{

    public Particular(TipoMarca marca, int modelo, String placa, String color, int precio) {
        super(marca, modelo, placa, color, precio);
    }
}
