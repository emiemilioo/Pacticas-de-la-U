def crearDicsueldos(nombreArchivo, mes_especifico):
    d={}
    tarifa_normal=9.50
    tarifa_extra=tarifa_normal*1.25
    f=open(nombreArchivo,"r")
    f.readline()
    f.readline()
    for linea in f:
        departamento, fecha, id, horas, puntual = linea.strip().split(",")
        fecha_partes = fecha.split("-")  
        horas = int(horas)
        
        if mes_especifico == fecha_partes[1]:
            d.setdefault(id, 0)
            if horas > 8:  
                h_extras = horas - 8
                h_normales = horas - h_extras
                sueldo = (h_normales * tarifa_normal) + (h_extras * tarifa_extra)
                d[id] += sueldo
            elif horas <= 8:  
                sueldo = horas * tarifa_normal
                d[id] += sueldo
    f.close()
    return d

def reporte(Archivo):
    atrasos={}
    archivo=open(Archivo,"r")
    archivo.readline()
    archivo.readline()
    for linea in archivo:
        departamento, fecha, id, horas, puntual = linea.strip().split(",")
        if puntual=="NO":
            atrasos.setdefault(id, puntual)
    archivo.close
    return atrasos

nombreArchivo = "empleados.txt"
dic1=crearDicsueldos(nombreArchivo,"Noviembre")
dic2=crearDicsueldos(nombreArchivo,"Diciembre")
dic3=reporte(nombreArchivo)
dic1.update(dic2)
print(dic1)
total=0
reporte_mensual= open("reporteMensual.txt", "w")
reporte_mensual.write("ID, Total\n")
for clave, valor in dic1.items():
    reporte_mensual.write(f"{clave}: {valor}\n")
    total+=valor
reporte_mensual.write(f"Total Mensual: {total}")
reporte_mensual.close()