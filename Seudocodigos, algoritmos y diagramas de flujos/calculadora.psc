Algoritmo calculadora
	Definir n1 , n2 Como Entero
	Definir operacion Como Caracter
	Definir suma, resta, multiplicacion, division Como Real
	
	
	Escribir "Dijite dos numeros"
	Leer n1,n2
	Escribir "Especifique que operacion logica quiere realizar"
	Leer operacion
	
	suma = n1 + n2
	resta = n1 - n2
	multiplicacion = n1 * n2
	division =  n1 / n2
	
	si operacion = "suma" Entonces
		Imprimir "la suma de los dos dijitos es ", suma
	SiNo
		si operacion = "resta" Entonces
			Imprimir  "La resta de los dos dijitos es ", resta
		SiNo
			si operacion = "multiplicacion" Entonces
				Imprimir  "La multiplicacion de los dos dijitos es ", multiplicacion
			SiNo
				si operacion = "division" Entonces
					Imprimir  "La divicion de los dos dijitos es ", division
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
