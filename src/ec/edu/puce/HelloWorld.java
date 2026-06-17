package ec.edu.puce;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		IO.println("Alternativa a partir de la version 25");

		int edad = 25;
		boolean mayorEdad = false;
		String nombre = "Angie";

		IO.println("La edad es" + edad + "y su nombre es" + nombre);

		System.out.printf("La edad es: \n%s y su nombre es %s\n", edad, nombre);

		if (edad > 18) {
			mayorEdad = true;
		}

		if (mayorEdad) {
			IO.println("Mayor de edad");
		}

		else

		{
			IO.println("Menor de edad");
		}

	}

}
