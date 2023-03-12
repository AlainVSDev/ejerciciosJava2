// 9. Escribir mostrar en pantalla los primeros 100 numeros primos

public static void main(String[] args) {
	numPrimos();
	}
		
	public static void numPrimos() {
        int contadorDePrimos = 0;
        int numeroActual = 2;

        while (contadorDePrimos < 100) {
            boolean esPrimo = true;

            for (int divisor = 2; divisor <= Math.sqrt(numeroActual); divisor++) {
                if (numeroActual % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(numeroActual + " Es un Numero primo");
                contadorDePrimos++;
            }

            numeroActual++;
        } }

//// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

public static void main(String[] args) {
		
		
		int a = 5;
		int b = 6;
		int resultado = suma(a,b);
		System.out.println(" La suma de " + a + " y " + b + " es: " + resultado);
	}

	public static int suma (int a, int b) {
		while (b != 0) {
	        int carry = a & b;
	        a = a ^ b;
	        b = carry << 1;
	    }
	    return a;
	}
		
	


// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo

public static void main(String[] args) {
		
		int num = 9;
		System.out.println(esPalindromo(num));
		
	}
	
	public static boolean esPalindromo(int num) {
	   
	    if (num < 10 || num > 99) {
	    	System.out.println("No es un numero de 2 digitos");
	        return false ;
	    }	    
	    int primerDigito = num / 10;
	    int segundoDigito = num % 10;
	    if (primerDigito == segundoDigito) {
	    	System.out.println("Si es un numero palindromo");
	        return true;
	    } else {
	    	System.out.println("No es un numero Palindromo");
	        return false;
	    } }
// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10

	public static void main(String[] args) {
		
		int num = 15;
		System.out.println("la suma de los digitos de: " + num + " es " + sumaDigitos(num) + " donde el primer dígito es " + (num / 10) + " y el segundo dígito es " + (num % 10));
		
	}
	public static int sumaDigitos(int num) {
	    int dig1 = num / 10;   
	    int dig2 = num % 10;  
	    
	    int suma = dig1 + dig2;  
	    
	    return suma;
	}



// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"

public static void main(String[] args) {
		
		  String str = "Hola  Mundo";
	        String strSinEspacios = removerEspaciosBlanco(str);
	        System.out.println(str + " | Sin espacios quedaria: " + strSinEspacios);
	    }

	    public static String removerEspaciosBlanco(String str) {
	        return str.replaceAll("\\s", "");
	    }



// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

public static void main(String[] args) {
		
		
		System.out.println(invertir("hola"));
		
		
	}
	public static String invertir(String str) {
	    StringBuilder nuevoTexto = new StringBuilder(str); //Stringbuiledr se usa para modificar una cadena sin crear un objeto 
	    
	    nuevoTexto.reverse();
	    
	    return nuevoTexto.toString();
	}

// 15. Escribir un metodo para encontrar el factorial de un numero sin loops

public static void main(String[] args) {
		
		
		int resultado = factorial(10);
		System.out.println("El factorial de 10 es: " + resultado);
		
		
	}
	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    else {
	        return n * factorial(n-1);
	    }
	}
