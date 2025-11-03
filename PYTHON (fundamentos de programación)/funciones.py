# Funciones
def getNombre():
  # CODIGO
  # SI su edad es mayor a 20 retornar nombres, apellido y un indicador si es mayor de edad
  # Caso contrario retornar nombre, apellido y nada más
  nombre = input("Ingrese su nombre: ").strip()
  apellido = input("Ingrese su apellido: ").strip()
  edad =  input("Ingrese su edad: ").strip()

  if (int(edad) > 20):
    return nombre,apellido,"Mayor de Edad"

  return nombre,apellido


# print("Luego de la llamadad getNombre()")
# print(getNombre())


# Realizar una función que retorne un input valido como entero positivo 

def getNumeroValido() : 
  numero = input("Ingrese un número : ")
  while (not numero.isdigit()):
    print("Input ingresado no es un número valido")
    numero = input("Ingrese un número : ")

  return int(numero)

#print(getNumeroValido())

def getNombre():
  # CODIGO
  # SI su edad es mayor a 20 retornar nombres, apellido y un indicador si es mayor de edad
  # Caso contrario retornar nombre, apellido y nada más
  nombre = input("Ingrese su nombre: ").strip()
  apellido = input("Ingrese su apellido: ").strip()
  edad =  getNumeroValido()

  if (int(edad) > 20):
    return nombre,apellido,"Mayor de Edad"

  return nombre,apellido




print("Luego de la llamadad getNombre()")
print(getNombre())