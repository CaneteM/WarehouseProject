package almacenes_exfeb23;

import java.util.ArrayList;

public class articulos extends proveedores {

	/*
	 * de el código de artículo, nombre, descripción, precio de venta, iva aplicado,
	 * proveedor del artículo, número de unidades disponibles.
	 */

	protected String codigo;
	protected String nombre;
	protected String descripcion;
	protected float precioVenta;
	protected int iva;
	protected int unidad;
	boolean bool = true;

	protected proveedores pro;

	public articulos(String codigo, String nombre, String descripcion, float precio, int iva, int unidad,
			proveedores pro) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioVenta = precio;
		this.iva = iva;
		this.unidad = unidad;
		this.pro = pro;

	}

	public articulos(String codigo, String nombre, String descripcion, float precio, int iva, int unidad) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioVenta = precio;
		this.iva = iva;
		this.unidad = unidad;

	}

	public articulos() {

		// TODO Auto-generated constructor stub
	}

	ArrayList<proveedores> proveedor = new ArrayList<proveedores>();

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getUnidad() {
		return unidad;
	}

	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}

	@SuppressWarnings("unlikely-arg-type")
	public boolean existeProveedor(int codigo, proveedores nombre) {

		if (proveedor.contains(nombre.nombreProveedor)) {
			this.proveedor.add(codigo,nombre);
			return bool;
		}
		{
			bool = false;
			return bool;
		}
	};

	public void altaProveedor(proveedores p) {

		this.proveedor.add(p);
	}

	public void bajaProveedor(String codigo) {

		proveedor.removeIf(proveedores -> proveedores.getCodigoProveedor().equals(codigo));

	}

	public String toString() {

		return codigo + " " + nombre + " " + precioVenta + " ";
	}

}
