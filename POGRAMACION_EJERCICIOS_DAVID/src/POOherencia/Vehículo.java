package POOherencia;

public class Vehículo {
	String marca;
    String modelo;
    int año;

    public Vehículo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
class Automovil extends Vehículo {
    String tipoDeCombustible;

    public Automovil(String marca, String modelo, int año, String tipoDeCombustible) {
        super(marca, modelo, año);
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
}


