import numpy as np
M=np.arange(43,43+12).reshape(3,4)
forma=M.shape
N=np.random.randint(43,96,size=forma)
forma2=forma[::-1]
O=np.random.randint(43,96,size=forma2)
Suma=np.sum(M[:-1,::],axis=0)
M[-1]=Suma
filtro1= M==N
filtro2=M<(np.mean(M))
V=np.random.randint(43,55,size=forma)
filtro3= M==V
resultado=filtro3.all()
E=np.arange(0,forma[0])
mM=np.sort(M[0,::])[::-1]
nM=(np.sort(M).reshape(-1))[:7]
print(f"{M}\n \n{N}\n \n{O}\n \n{Suma}\n \n{filtro1}\n \n{M[filtro1]}\n \n{filtro2}\n \n{M[filtro2]}\n \n{V}\n \n{filtro3}\n \n{resultado}\n \n{E}\n")
print(mM)
print(nM)