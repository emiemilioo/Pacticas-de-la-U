import numpy as np
def crear_matrices(nombre_archivo):
    f=open(nombre_archivo,"r")
    Meses=np.array(f.readline().strip().split(":")[1].split(","))
    Farmacias=np.array(f.readline().strip().split(":")[1].split(","))
    f.readline()
    M=np.zeros((len(Farmacias),len(Meses)),int)
    for linea in f:
        fecha,farmacia,valor_compra=linea.strip().split(",")
        valor_compra=int(valor_compra)
        año,mes,dia=fecha.split("-")
        indFila=np.where(Farmacias==farmacia)[0][0]
        indCols=np.where(Meses==mes)[0][0]
        M[indFila,indCols]+=valor_compra
    return Farmacias, Meses, M