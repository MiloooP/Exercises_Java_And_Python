Proceso VENTAS
		Definir c, bonificacion Como Real
		Escribir "Ingrese monto de venta"
		Leer c
		
		Si c > 20000 Entonces
			bonificacion <- 0.08
		Sino
			Si c > 5000 Entonces
				bonificacion <- 0.05
			Sino
				Si c > 1000 Entonces
					bonificacion <- 0.03
				Sino
					bonificacion <- 0
				FinSi
			FinSi
		FinSi
		
		Escribir "La bonificación (%) es: ", bonificacion*100," y la bonificación en dinero es: ", c*bonificacion
FinProceso

