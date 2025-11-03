dic={}
number=0
numero=input("Ingrese un numero: ")
while not(numero.isdigit() and int(numero)<=10):
    print("Entrada no valida")
    numero=input("Ingrese un numero: ")

numero= int(numero)
for num in range(1,13):
    dic[num]= num*numero
print(dic)
    
tabla= open("tabla_n.txt","w")
tabla.write(f"LA TABLE DEL {numero}:\n")
for valor,clave in dic.items():
    tabla.write(f"{valor} x {numero} = {clave}\n")

