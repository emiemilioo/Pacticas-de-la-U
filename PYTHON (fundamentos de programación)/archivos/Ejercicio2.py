#Ejercicio de contar ---------------------------------------------
#-----------------------------------------------------------------

archivo= open("text1.txt","r")
contenido= archivo.read()

# todo menos los saltos de linea.
caracteres_sin_saltosdelinea=len(contenido.replace("\n",""))

# contar sin incluir saltos de linea o espacios en blanco
caracteres_sin_saltosdelinea_y_espacios=len(contenido.replace("\n","").replace(" ",""))

# contar solo vocales 
contador_vocales=sum(1 for letra in contenido if letra in "aeiouAEIOU")

#ver la linea mas larga y cuantos caracteres tiene:
linea_mas_larga=""
mas_caracteres=0
palabras_total=0
lineas=contenido.splitlines()
for linea in lineas:
    longuitud_de_lineas=len(linea)
    if longuitud_de_lineas > mas_caracteres:
        mas_caracteres=longuitud_de_lineas
        linea_mas_larga=linea

    # cuantas plabras hay:
    linea=linea.split(" ")
    palabras_total+=len(linea)

archivo.close()

print(caracteres_sin_saltosdelinea)
print(caracteres_sin_saltosdelinea_y_espacios)
print(contador_vocales)
print(f"{linea_mas_larga} : {mas_caracteres}")
print(palabras_total)


