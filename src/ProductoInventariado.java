
public class ProductoInventariado extends Producto{

	private double beneficio;
	private boolean esPorcentaje;
	
	public ProductoInventariado() {
		this.beneficio = 0;
		this.esPorcentaje = false;
		this.setNombre("");
		this.setCodigo("");
		this.setPrecio(0);
	}
	
	public ProductoInventariado(double b, boolean e,String n, String c, double p) {
		this.beneficio = b;
		this.esPorcentaje = e;
		this.setNombre(n);
		this.setCodigo(c);
		this.setPrecio(p);
	}

	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

	public boolean isEsPorcentaje() {
		return esPorcentaje;
	}

	public void setEsPorcentaje(boolean esPorcentaje) {
		this.esPorcentaje = esPorcentaje;
	}
	
	public String toString()
	{
		String tipo = (this.esPorcentaje)? "%" : "MXN";
		double pp = 0;
		if(this.esPorcentaje) {
			pp = this.getPrecio() + ((this.getPrecio() * this.getBeneficio()) / 100);
		}else {
			pp = (this.getPrecio()+this.getBeneficio());
		}
		return "Nombre: "+this.getNombre()+", Código: "+this.getCodigo()+", Precio: "+this.getPrecio()+", Beneficio: "+this.getBeneficio()+tipo+", Precio al público: "+pp;
	}
}
