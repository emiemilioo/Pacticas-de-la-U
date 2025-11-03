#-----------------------------------------------------------------------------
#Ejercicio 1

print("Ejercicio 1:")
print("            ")
horas = input("Ingrese el numero de horas trabajadas: ")
if int(horas) > 8:
    hn = 8
    he = int(horas) - 8
    total = (int(hn) * 10) + (int(he) * 12.50)
    print("Horas Normales: ", hn)
    print("Horas Extras: ", he)
    print("Su total a recibir es: ",total)

else:
    hn = horas
    he = 0
    total = (int(horas) * 10) + (int(he) * 12.50)
    print("Horas Normales: ", hn)
    print("Horas Extras: ", he)
    print("Su total a recibir es: ",total)

#-----------------------------------------------------------------------------
#Ejercicio 2

cadena=input("Ingrese una cadena: ")
cada=cadena[:3]
cade=cadena[3:6]
cadi=cadena[6:]
print("(",cada,")",cade,"-",cadi)


#-----------------------------------------------------------------------------
#Ejercicio 3

url=input("Ingrese url: ")
ind1=url.index(".")
ind2=url.index("/",ind1)
dominio=url[ind1 + 1:ind2]
print(dominio)

#-----------------------------------------------------------------------------
#Ejercicio 4