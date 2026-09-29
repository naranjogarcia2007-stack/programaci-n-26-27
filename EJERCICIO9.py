Python 3.14.7 (tags/v3.14.7:823f032, Aug  5 2026, 10:51:32) [MSC v.1944 64 bit (AMD64)] on win32
Enter "help" below or click "Help" above for more information.
>>> # Solicitar datos al usuario
... nombre = input("Introduce tu nombre: ")
... year_nacimiento = input("Introduce tu year de nacimiento: ")
... altura = input("Introduce tu altura en metros (ejemplo: 1.75): ")
... 
... # Convertir los datos
... year_nacimiento = int(year_nacimiento)
... altura = float(altura)
... 
... # Calcular la edad aproximada
... edad = 2026 - year_nacimiento
... 
... # Mostrar los tipos de datos
... print("\nTipos de datos:")
... print("Nombre:", type(nombre))
... print("Year de nacimiento:", type(year_nacimiento))
... print("Altura:", type(altura))
... print("Edad:", type(edad))
... 
... # Mostrar toda la información
... print("\n--- Información personal ---")
... print("Hola", nombre + "!")
... print("Naciste en", year_nacimiento)
... print("Tu edad aproximada en 2026 es", edad, "years")
... print("Tu altura es", altura, "metros")
