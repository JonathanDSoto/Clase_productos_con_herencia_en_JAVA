
public class Producto {
		
	private String nombre;
	private String codigo;
	private double precio;

	
	public Producto() {
		this.nombre = "";
		this.codigo = "";
		this.precio = 0;
	}
	
	public Producto(String n, String c, double p) {
		this.nombre = n;
		this.codigo = c;
		this.precio = p;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
