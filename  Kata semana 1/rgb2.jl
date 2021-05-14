let
Hex = Dict(0 => "0", 1 => "1", 2 => "2", 3 => "3", 4 => "4", 5 => "5", 6 => "6", 7 => "7", 8 => "8",  9 => "9", 10 => "A", 11 => "B", 12 => "C", 13 => "D", 14 => "E", 15 => "F")

print("Ingrese el color rojo: ")
Rojo = readline()
Rojo = parse(Int64, Rojo)


Sec = 0
H = ""
Str = ""

while Rojo > 1
	Sec = Rojo % 16
	H = Hex[Sec]
	Str = Str * H
	Rojo = Rojo / 16
	Rojo = floor(Rojo)
end

if Rojo != 0
Rojo = convert(Int64, Rojo)
Rojo = string(Rojo)
Str = Str * Rojo
end

Str = reverse(Str)



print("Ingrese el color verde: ")
Verde = readline()
Verde = parse(Int64, Verde)


Sec1 = 0
H1 = ""
Str1 = ""

while Verde > 1
	Sec1 = Verde % 16
	H1 = Hex[Sec1]
	Str1 = Str1 * H1
	Verde = Verde / 16
	Verde = floor(Verde)
end

if Verde != 0
Verde = convert(Int64, Verde)
Verde = string(Verde)
Str1 = Str1 * Verde
end

Str1 = reverse(Str1)




print("Ingrese el color azul: ")
Azul = readline()
Azul = parse(Int64, Azul)


Sec2 = 0
H2 = ""
Str2 = ""

while Azul > 1
	Sec2 = Azul % 16
	H2 = Hex[Sec2]
	Str2 = Str2 * H2
	Azul = Azul / 16
	Azul = floor(Azul)
end

if Azul != 0
Azul = convert(Int64, Azul)
Azul = string(Azul)
Str2 = Str2 * Azul
end

Str2 = reverse(Str2)


print("En hexadecimal es: #")
print(Str * Str1 * Str2)

end