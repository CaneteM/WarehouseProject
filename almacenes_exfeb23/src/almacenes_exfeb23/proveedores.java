package almacenes_exfeb23;

import java.util.ArrayList;

public class proveedores {

	protected String codigoProveedor;
	protected String nombreProveedor;
	protected String direccion;
	protected String fechaAlta;
	protected String telefono;
	protected String correo;


	public proveedores(String codigo, String nombre, String dir, String fecha, String tel, String correo) {

		this.codigoProveedor = codigo;
		this.nombreProveedor = nombre;
		this.direccion = dir;
		this.fechaAlta = fecha;
		this.telefono = tel;
		this.correo = correo;

	}
	
	public proveedores(String nombre) {

		
		this.nombreProveedor = nombre;
		

	}

	public proveedores() {
		// TODO Auto-generated constructor stub
	}

	ArrayList<articulos> articulo = new ArrayList<articulos>();

	public void alta(articulos a) {

		this.articulo.add(a);
	}

	public void baja(String codigo) {

		articulo.removeIf(articulos -> articulos.getCodigo().equals(codigo));

	}
	
	

	public String toString() {

		return getNombreProveedor() ;
	}

	public String getCodigoProveedor() {
		return codigoProveedor;
	}

	public void setCodigoProveedor(String codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}

	public String getNombreProveedor() {
		
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
