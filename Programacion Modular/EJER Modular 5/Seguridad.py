#Crea un módulo llamado seguridad.py con una función que 
#genere contraseñas aleatorias de una determinada longitud, 
#incluyendo mayúsculas, minúsculas, números y caracteres especiales. 
#En el programa principal, permite al usuario especificar 
#la longitud de la contraseña y generar varias contraseñas.

import random
import string

def generar_contrasena(longitud):
    """
    Generador de una contraseña aleatoria de la longitud determinada.
    La contraseña incluye mayúsculas, minúsculas, números y caracteres especiales.
    """
    if longitud < 4:
        raise ValueError("La contraseña debe tener al menos 4 caracteres.")

    mayusculas = string.ascii_uppercase
    minusculas = string.ascii_lowercase
    numeros = string.digits
    especiales = string.punctuation

    contrasena = [
        random.choice(mayusculas),
        random.choice(minusculas),
        random.choice(numeros),
        random.choice(especiales)
    ]

    if longitud > 4:
        todos_caracteres = mayusculas + minusculas + numeros + especiales
        contrasena += random.choices(todos_caracteres, k=longitud - 4)

    random.shuffle(contrasena)
    return ''.join(contrasena)
