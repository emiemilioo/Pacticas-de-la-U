d = {}
mes_especifico = "Noviembre"
f = open("empleados.txt", "r")
f.readline()  
tarifa_normal = 9.50
tarifa_extra = tarifa_normal * 1.25
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

print(d)
print(type(horas))
