#Crea un módulo llamado juego.py con una función que genere
#un número aleatorio entre 1 y 100. En el programa principal, 
#importa el módulo y pide al usuario que adivine el número. 
#El programa debe indicar si el número ingresado es mayor, 
#menor o igual al número secreto.

import random

def generar_numero():
    """Genera y retorna un número aleatorio entre 1 y 100"""
    return random.randint(1, 5)