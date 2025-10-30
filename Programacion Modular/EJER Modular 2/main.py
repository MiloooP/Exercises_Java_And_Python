import Juego

def main():
    print("¡Adivina el número secreto entre 1 y 100!")
    numero_secreto = Juego.generar_numero()
    intento = None

    while intento != numero_secreto:
        try:
            intento = int(input("Ingresa tu número: "))
            
            if intento < numero_secreto:
                print("El número secreto es mayor.")
            elif intento > numero_secreto:
                print("El número secreto es menor.")
            else:
                print("¡Felicidades! Adivinaste el número secreto.")
        except ValueError:
            print("Por favor, ingresa un número válido.")

if __name__ == "__main__":
    main()