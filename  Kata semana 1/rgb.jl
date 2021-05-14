Hex = Dict(1 => "1", 2 => "2", 3 => "3", 4 => "4", 5 => "5", 6 => "6", 7 => "7", 8 => "8", 9 => "9", 10 => "A", 11 => "B", 12 => "C", 13 => "D", 14 => "E", 15 => "F")

print("Ingrese el color rojo ")
Rojo = readline()
Rojo = parse(Int64, Rojo)
Rojo = string(Rojo, base = 16)

print("Ingrese el color azul ")
Azul = readline()
Azul = parse(Int64, Azul)
Azul = string(Azul, base = 16)

print("Ingrese el color verde ")
Verde = readline()
Verde = parse(Int64, Verde)
Verde = string(Verde, base = 16)

print("En hexadecimal es: #")
print(Rojo*Azul*Verde)