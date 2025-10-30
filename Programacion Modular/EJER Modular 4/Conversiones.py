#Crea un módulo llamado conversiones.py con funciones para 
#convertir entre diferentes unidades de medida 
#(longitud, masa, temperatura). En el programa principal, 
#permite al usuario seleccionar las unidades de origen y destino, y el valor a convertir.

def metros_a_kilometros(metros):
    return metros / 1000

def kilometros_a_metros(km):
    return km * 1000

def metros_a_centimetros(metros):
    return metros * 100

def centimetros_a_metros(cm):
    return cm / 100

def gramos_a_kilogramos(gramos):
    return gramos / 1000

def kilogramos_a_gramos(kg):
    return kg * 1000

def libras_a_kilogramos(libras):
    return libras * 0.453592

def kilogramos_a_libras(kg):
    return kg / 0.453592

def celsius_a_fahrenheit(c):
    return (c * 9/5) + 32

def fahrenheit_a_celsius(f):
    return (f - 32) * 5/9

def celsius_a_kelvin(c):
    return c + 273.15

def kelvin_a_celsius(k):
    return k - 273.15
