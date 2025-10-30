import Contactos

def mostrar_menu():
    print("\n=== MENÚ DE CONTACTOS ===")
    print("1. Agregar contacto")
    print("2. Buscar contacto")
    print("3. Eliminar contacto")
    print("4. Ver todos los contactos")
    print("5. Salir")

def main():
    lista_contactos = []

    while True:
        mostrar_menu()
        opcion = input("Elige una opción: ")

        if opcion == "1":
            nombre = input("Nombre: ")
            telefono = input("Teléfono: ")
            correo = input("Correo: ")
            print(Contactos.agregar_contacto(lista_contactos, nombre, telefono, correo))

        elif opcion == "2":
            nombre = input("Ingresa el nombre a buscar: ")
            print(Contactos.buscar_contacto(lista_contactos, nombre))

        elif opcion == "3":
            nombre = input("Ingresa el nombre a eliminar: ")
            print(Contactos.eliminar_contacto(lista_contactos, nombre))

        elif opcion == "4":
            if not lista_contactos:
                print("No hay contactos guardados.")
            else:
                print("\n=== LISTA DE CONTACTOS ===")
                for c in lista_contactos:
                    print(f"- {c['nombre']} | {c['telefono']} | {c['correo']}")

        elif opcion == "5":
            print("Salida Exitosa")
            break

        else:
            print("Opción no válida. Intenta de nuevo.")

if __name__ == "__main__":
    main()
