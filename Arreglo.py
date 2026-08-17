def sumar_arreglo(arr):
    suma=0
    for elemento in arr:
        suma+=elemento
    return suma
numeros=[1,2,3,4,5]
print(sumar_arreglo(numeros))