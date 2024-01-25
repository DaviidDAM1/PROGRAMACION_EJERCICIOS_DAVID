package POO3;


public class SistemasdeHotel {
	private int numeroHabitacion;
    private String tipo;
    private boolean ocupada;
 
    public SistemasdeHotel(int numeroHabitacion, String tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.ocupada = false;
    }
 
    public SistemasdeHotel() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
 
    public String getTipo() {
        return tipo;
    }
 
    public boolean estaOcupada() {
        return ocupada;
    }
 
    public void reservar() {
        ocupada = true;
        System.out.println("Habitación " + numeroHabitacion + " reservada.");
    }
 
    public void cancelarReserva() {
        ocupada = false;
        System.out.println("Reserva de habitación " + numeroHabitacion + " cancelada.");
    }

	public void mostrarDisponibilidad() {
		// TODO Auto-generated method stub
		
	}

	public void reservarHabitacion(int numReserva) {
		// TODO Auto-generated method stub
		
	}

	public void cancelarReserva(int numCancelacion) {
		// TODO Auto-generated method stub
		
	}
}
 
class Hotel {
    private SistemasdeHotel[] habitaciones;
 
    public Hotel(int numHabitaciones) {
        habitaciones = new SistemasdeHotel[numHabitaciones];
        for (int i = 0; i < numHabitaciones; i++) {
            habitaciones[i] = new SistemasdeHotel(i + 1, "Simple");
        }
    }
 
    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de habitaciones:");
 
        for (SistemasdeHotel habitacion : habitaciones) {
            String estado = habitacion.estaOcupada() ? "Ocupada" : "Disponible";
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() + ": " + estado);
        }
    }
 
    public void reservarHabitacion(int numeroHabitacion) {
        if (numeroHabitacion >= 1 && numeroHabitacion <= habitaciones.length) {
            if (!habitaciones[numeroHabitacion - 1].estaOcupada()) {
                habitaciones[numeroHabitacion - 1].reservar();
            } else {
                System.out.println("La habitación " + numeroHabitacion + " ya está ocupada.");
            }
        } else {
            System.out.println("Número de habitación no válido.");
        }
    }
 
    public void cancelarReserva(int numeroHabitacion) {
        if (numeroHabitacion >= 1 && numeroHabitacion <= habitaciones.length) {
            if (habitaciones[numeroHabitacion - 1].estaOcupada()) {
                habitaciones[numeroHabitacion - 1].cancelarReserva();
            } else {
                System.out.println("La habitación " + numeroHabitacion + " no está ocupada.");
            }
        } else {
            System.out.println("Número de habitación no válido.");
        }
    }

}


