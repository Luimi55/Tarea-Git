function main()

print("Ingrese el color rojo: ")
Rojo = readline()
Rojo = parse(Int64, Rojo)
Rojoh = rgbToHex(Rojo)

print("Ingrese el color verde: ")
Verde = readline()
Verde = parse(Int64, Verde)
Verdeh = rgbToHex(Verde)

print("Ingrese el color azul: ")
Azul = readline()
Azul = parse(Int64, Azul)
Azulh = rgbToHex(Azul)

print("En hexadecimal es: #")
print(Rojoh * Verdeh * Azulh)
end


function rgbToHex(Color)

Hex = Dict(0 => "0", 1 => "1", 2 => "2", 3 => "3", 4 => "4", 5 => "5", 6 => "6", 7 => "7", 8 => "8",  9 => "9", 10 => "A", 11 => "B", 12 => "C", 13 => "D", 14 => "E", 15 => "F")

Sec = 0
H = ""
Str=""

while Color > 1
	Sec = Color % 16
	H = Hex[Sec]
	Str = Str * H
	Color = Color / 16
	Color = floor(Color)
end

if Color != 0
Color = convert(Int64, Color)
Color = string(Color)
Str = Str * Color
end 

Str = reverse(Str)

return Str

end


main()