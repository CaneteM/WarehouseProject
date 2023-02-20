package almacenes_exfeb23;



public class ventas extends articulos{

	public float precio;
	public String fecha;
	public int iva;
	public float total;
	public String codigo;
	public String nombre;


	public ventas() {
	super();
		

	}
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.iva = iva / 100;
		this.iva = 1 + iva;
		this.total = this.iva * total;
	}
	
	public String toString() {
		
		return precio + " " + " " + total + " " + super.toString();
	}

}
