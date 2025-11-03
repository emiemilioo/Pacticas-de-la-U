import random as rd

elementos = []

for i in range(20):
    elementos.append(rd.randint(10,20))

intentos = 6
pares_encontrados = 0

print(elementos)

while not(intentos == 0 or pares_encontrados == 3):
    num1 = input("Ingrese casilla 1: ")
    num2 = input("Ingrese casilla 2: ")

    while num1 == num2:
        print("Casillas repetidas.\n")
        num1 = input("Ingrese casilla 1: ")
        num2 = input("Ingrese casilla 2: ")

    num1 = int(num1)
    num2 = int(num2)

    print(f"La casilla {num1} contiene: {elementos[num1-1]}")
    print(f"La casilla {num2} contiene: {elementos[num2-1]}")

    if elementos[num1 - 1] == elementos[num2 - 1]:
        print("Son iguales")
        pares_encontrados += 1
    else:
        print("NO Son iguales")

    print(f"Pares encontrados: {pares_encontrados}")
    intentos -= 1
    print(f"Intentos restantes {intentos}\n")
    print(f"------------------------------------\n")

if pares_encontrados == 3:
    print("Felicidades ha ganado")
else:
    print("Ha perdido, siga intentando")
