def piramide(Nombre, numero=3):
    resultado= f"Un cordial saludo {Nombre}\n"
    contador = 0
    for i in range(0,numero+1): 
        if (contador < numero):
            contador+=1
            espacios = (" ")*(numero-i)
            estrellas=('*')*(contador*2) 
            resultado += espacios + estrellas + "\n"
    return resultado


print(piramide("emilio",5))