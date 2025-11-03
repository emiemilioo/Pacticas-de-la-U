
print("hola")
with open("texto.txt", "r") as archivo:
    contenido = archivo.read()
    lineas = contenido.splitlines()  # Divide el contenido por líneas
    print(lineas)
# Mostrar las líneas
#for linea in lineas:
#    print(linea)

