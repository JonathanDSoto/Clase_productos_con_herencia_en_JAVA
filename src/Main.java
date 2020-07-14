import java.util.ArrayList;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		ArrayList<ProductoInventariado> pi = new ArrayList<ProductoInventariado>();
		boolean power = true;
		
		while(power)
		{
			System.out.println("Menú");
			System.out.println("1.- Nuevo producto");
			System.out.println("2.- Ver producto");
			System.out.println("3.- Salir");
			
			int op = teclado.nextInt();
			switch(op) {
				case 1:
					System.out.println("Ingrese los datos del producto");
					ProductoInventariado temp = new ProductoInventariado();
					
					System.out.println("Nombre del producto");
					temp.setNombre(teclado.next());
					
					System.out.println("Código del producto");
					temp.setCodigo(teclado.next());
					
					System.out.println("Precio del producto");
					temp.setPrecio(teclado.nextDouble());
					
					System.out.println("Beneficio del producto");
					temp.setBeneficio(teclado.nextDouble());
					
					System.out.println("Es porcentaje?");
					temp.setEsPorcentaje(teclado.nextBoolean());
					pi.add(temp);
				break;
				case 2:
					System.out.println("Tienes un total de "+pi.size()+" productos");
					System.out.println("Cual desea ver? 0-n");
					
					op = teclado.nextInt();
					
					System.out.println(pi.get(op).toString());
					
					break;
				case 3:
					System.out.println("Good bye");
					power = false;
					break;
			}
		}
	}

}
