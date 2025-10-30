#Crea un módulo llamado contactos.py con funciones para agregar,
#eliminar y buscar contactos. Un contacto debe tener nombre,
#teléfono y correo electrónico. En el programa principal,
#crea un menú interactivo para que el usuario pueda realizar
#las diferentes operaciones.

def agregar_contacto(contactos, nombre, telefono, correo):
    contacto = {
        "nombre": nombre,
        "telefono": telefono,
        "correo": correo
    }
    contactos.append(contacto)
    return f"✅ Contacto '{nombre}' agregado correctamente."

def buscar_contacto(contactos, nombre):
    for contacto in contactos:
        if contacto["nombre"].lower() == nombre.lower():
            return f"Nombre: {contacto['nombre']} | Teléfono: {contacto['telefono']} | Correo: {contacto['correo']}"
    return f"No se encontró el contacto '{nombre}'."

def eliminar_contacto(contactos, nombre):
    for contacto in contactos:
        if contacto["nombre"].lower() == nombre.lower():
            contactos.remove(contacto)
            return f"Contacto '{nombre}' eliminado correctamente."
    return f"No se encontró el contacto '{nombre}'."