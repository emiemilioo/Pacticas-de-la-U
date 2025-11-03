import random as rd
jugador1=input("Ingrese jugador uno: ")
jugador2=input("Ingrese jugador dos: ")
tazon=20
jugadorActual= jugador1

while tazon>0:
    print("Numeros de piedras", tazon)
    dado=rd.randint(1,6)
    tazon-=dado
    print(f"Dado de {jugadorActual}: {dado}")
    if jugadorActual==jugador1:
        jugadorActual=jugador2
    else:
        jugadorActual=jugador1
print("Ganador es:", jugadorActual)
