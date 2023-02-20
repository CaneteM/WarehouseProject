package almacenes_exfeb23;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		proveedores[] arr = new proveedores[2];
		articulos[] arr2 = new articulos[2];
		proveedores p1 = new proveedores("0001l", "Jose", "Siempre vivo 33", "12/01/2022", "232313", "j@hotmail.com");

		articulos a1 = new articulos("1230ee", "Pomada", "articulo liquido", 100, 10, 1, p1);

		proveedores p2 = new proveedores("00012", "Miguel", "Calle Alegria 33", "12/01/2022", "232313",
				"M@hotmail.com");

		articulos a2 = new articulos(null, null, null, 0, 0, 0);
		arr[0] = p1;
		arr[1] = p2;
		arr2[0] = a1;
		arr2[1] = a2;

		System.out.println("1.Alta Articulo \n" + "2.Baja Articulo \n" + "3.Alta Proveedor \n" + "4.Baja Proveedor \n"
				+ "5.Listar Articulos \n" + "6.Lista Proveedores \n" + "7.Venta Articulo \n"
				+ "8.Existencias disponibles \n" + "9. Salir \n");

		int op;
		do {

			System.out.println("Seleccionar opcion");
			op = Integer.parseInt(leer.next());
			switch (op) {
			case 1:
				System.out.println("Alta producto a1 al proveedor p1");
				p1.alta(a1);
				break;
			case 2:
				System.out.println("Dame codigo de producto");
				String codigo = leer.next();
				p1.baja(codigo);
				break;
			case 3:
				System.out.println("Alta del proveedor p1");
				a1.altaProveedor(p1);
				
				break;
			case 4:
				System.out.println("Dame codigo de Proveedor");
				String codigoPro = leer.next();
				a1.bajaProveedor(codigoPro);
				break;
			case 5:
				for (int i = 0; i < 2; i++) {

					System.out.println(arr2[i]);

				}
				break;
			case 6:
				for (int i = 0; i < 2; i++) {

					System.out.println(arr[i]);

				}
				break;

			case 7:
				System.out.println();
			case 8:

				System.out.println(a1.getUnidad());
				break;
			case 9:

			}
		} while (op != 9);
		
		
	System.out.println(a1.existeProveedor(op, a2));
	
	
	}

}
