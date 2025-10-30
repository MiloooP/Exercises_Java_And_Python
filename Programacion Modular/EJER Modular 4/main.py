import Conversiones

def menu_principal():
    print("Seleccione el tipo de conversión:")
    print("1. Longitud")
    print("2. Masa")
    print("3. Temperatura")
    opcion = input("Ingrese una opción: ")
    return opcion

def menu_longitud():
    print("Seleccione la conversión de longitud:")
    print("1. Metros a Kilómetros")
    print("2. Kilómetros a Metros")
    print("3. Metros a Centímetros")
    print("4. Centímetros a Metros")
    return input("Ingrese una opción: ")

def menu_masa():
    print("Seleccione la conversión de masa:")
    print("1. Gramos a Kilogramos")
    print("2. Kilogramos a Gramos")
    print("3. Libras a Kilogramos")
    print("4. Kilogramos a Libras")
    return input("Ingrese una opción: ")

def menu_temperatura():
    print("Seleccione la conversión de temperatura:")
    print("1. Celsius a Fahrenheit")
    print("2. Fahrenheit a Celsius")
    print("3. Celsius a Kelvin")
    print("4. Kelvin a Celsius")
    return input("Ingrese una opción: ")

def main():
    tipo = menu_principal()

    if tipo == "1":
        op = menu_longitud()
        valor = float(input("Ingrese el valor a convertir: "))
        if op == "1":
            print(f"{valor} metros = {Conversiones.metros_a_kilometros(valor)} kilómetros")
        elif op == "2":
            print(f"{valor} km = {Conversiones.kilometros_a_metros(valor)} metros")
        elif op == "3":
            print(f"{valor} metros = {Conversiones.metros_a_centimetros(valor)} cm")
        elif op == "4":
            print(f"{valor} cm = {Conversiones.centimetros_a_metros(valor)} metros")

    elif tipo == "2":
        op = menu_masa()
        valor = float(input("Ingrese el valor a convertir: "))
        if op == "1":
            print(f"{valor} g = {Conversiones.gramos_a_kilogramos(valor)} kg")
        elif op == "2":
            print(f"{valor} kg = {Conversiones.kilogramos_a_gramos(valor)} g")
        elif op == "3":
            print(f"{valor} lb = {Conversiones.libras_a_kilogramos(valor)} kg")
        elif op == "4":
            print(f"{valor} kg = {Conversiones.kilogramos_a_libras(valor)} lb")

    elif tipo == "3":
        op = menu_temperatura()
        valor = float(input("Ingrese el valor a convertir: "))
        if op == "1":
            print(f"{valor} °C = {Conversiones.celsius_a_fahrenheit(valor)} °F")
        elif op == "2":
            print(f"{valor} °F = {Conversiones.fahrenheit_a_celsius(valor)} °C")
        elif op == "3":
            print(f"{valor} °C = {Conversiones.celsius_a_kelvin(valor)} K")
        elif op == "4":
            print(f"{valor} K = {Conversiones.kelvin_a_celsius(valor)} °C")
    else:
        print("Opción no válida.")

if __name__ == "__main__":
    main()
