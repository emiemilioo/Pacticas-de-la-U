

import random as rd
jugador=10
partidas_ganadas=0
usr=""
while not(jugador<=0 or usr=="no"):
    usr=input("Ingrese el dinero a apostar o no para finalizar: \n").lower()
    if usr.isdigit():
        usr=int(usr)
        if usr<jugador:
            dados= rd.randint(1,6) + rd.randint(1,6)
            adivinacion= input("Adivine para o impar: \n").lower()
            while not(adivinacion in ["par","impar"]):
                print("Ingrese una entrada valida")
                adivinacion= input("Adivine para o impar: \n").lower()
            if (dados%2==0 and adivinacion=="par") or (dados%2!=0 and adivinacion=="impar"):
                jugador+=usr
                partidas_ganadas+=1
                print(f"Billetera actual: {jugador}\n")
            else:
                jugador-=usr
                print(f"Billetera actual: {jugador}\n")
        else:
            print("El monto a apostar supera a su billetera!")
    elif usr=="no":
        print("el juego finalizo")
    else:
        print("entrada no valida!")

if usr=="no":
    print(partidas_ganadas)
elif jugador<=0:
    print("Perdio, se quedo sin dinero!")