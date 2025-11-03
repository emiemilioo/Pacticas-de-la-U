archivo = open ("texto.txt","r")
suma=0
contador=0

#linea= archivo.readline()
#while(linea):
#    suma = suma + int(linea)
#    linea = archivo.readline()
#    contador+=1

lineas = archivo.readlines()
for linea in lineas:
    suma = suma + int(linea)
    contador+=1 


print(f"La suma es: {suma}")
print(f"El promedio es: {suma/contador}")
archivo.close()