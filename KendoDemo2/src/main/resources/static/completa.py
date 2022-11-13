import re


f = open("Estado.sql", "r")

lineas = f.readlines()
lineas = lineas[1:]

estados = {}
for e in lineas:
    i = re.search(r"\d+", e)
    n = re.split(", *", e)
    n1 = n[1].replace(")", "")
    n1 = n1.replace("'", "")
    estados[i.group(0)] = n1

f.close

f = open("Municipio.sql", "r")
lineas = f.readlines()
lineas = lineas[1:]

municipios = {}
for e in lineas :
    i = re.search(r"\d+", e)

    n = re.split(", *", e)
    n1 = n[1].replace(")", "")
    n1 = n1.replace("'", "")
    municipios[i.group(0)] =n1

f.close()


f = open("EstadoxMunicipios.sql", "r")
f2 = open("EstadoxMunicipio2.sql", "w")
lineas = f.readlines()
f2.write(lineas[0])
lineas = lineas[1:]

for e in lineas :
    listaAux = e.split(",")
    estado = estados[listaAux[1].strip()]
    municipio = municipios[listaAux[2].strip().replace(")", "")]
    i = e.replace("),", ", '" + estado+ "', '"+ municipio+ "'),\n")
    f2.write(i)


