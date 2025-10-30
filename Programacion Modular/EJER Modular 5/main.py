import Seguridad 
from colorama import Fore, Style, init

init(autoreset=True)

def mostrar_titulo(titulo):
    ancho = 50
    print(Fore.CYAN + "=" * ancho)
    print(Fore.YELLOW + titulo.center(ancho))
    print(Fore.CYAN + "=" * ancho + "\n")

def mostrar_contraseñas_en_cuadro(contrasenas):
    ancho = max(len(c) for c in contrasenas) + 4
    print(Fore.CYAN + "╔" + "═" * ancho + "╗")
    for c in contrasenas:
        print(Fore.YELLOW + "║ " + c.ljust(ancho - 2) + " ║")
    print(Fore.MAGENTA + "╚" + "═" * ancho + "╝")

def main():
    mostrar_titulo("GENERADOR DE CONTRASEÑAS")
    
    try:
        longitud = int(input(Fore.GREEN + "Ingrese la longitud de la contraseña (mínimo 4): "))
        cantidad = int(input(Fore.GREEN + "¿Cuántas contraseñas desea generar?: "))
        
        contrasenas = [Seguridad.generar_contrasena(longitud) for _ in range(cantidad)]
        mostrar_contraseñas_en_cuadro(contrasenas)

    except ValueError as e:
        print(Fore.RED + "Error:", e)

if __name__ == "__main__":
    main()
