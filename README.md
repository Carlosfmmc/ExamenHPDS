# Análisis de números de 6 dígitos
Queremos encontrar los números mayores o iguales a 1000 que la suma de cada cuatro dígitos consecutivos no puede ser mayor que un cierto valor dado. 

Si el número es d1d2d3d4d5d6, y la suma máxima de 4 dígitos contiguos es maxSum, entonces:

d1 + d2 + d3 + d4 <= maxSum
d2 + d3 + d4 + d5 <= maxSum
d3 + d4 + d5 + d6 <= maxSum

## Diseño
Para ello, necesitamos crear una función, analyze(....), que recibe 3 parámetros
1. Mínimo del intervalo de números a estudiar, no puede ser menor que 1000
2. Máximo del intervalo de números a estudiar, no puede ser mayor que 99.999
3.  La suma máxima que cada cuatro dígitos consecutivos deben ser menores o iguales 

La función genera un array con los datos detallados a continuación:
1. la cantidad de números que satisfacen la restricción presentada anteriormente
2. la suma total de todos los números encontrados

## Ejemplo

analyze(1000, 2000, 3) -------> [11, 12555]

 - Hay 11 números encontrados: 1000, 1001, 1002, 1010, 1011, 1020, 1100, 1101, 1110, 1200 y 2000

 - 12555 es la suma de todos los números encontrados
      1000 + 1001 + 1002 + 1010 + 1011 + 1020 + 1100 + 1101 + 1110 + 1200 + 2000 = 12555

## Casos
analyze(1000, 2000, 4) -----> [21, 23665]

analyze(1000, 2000, 7) -----> [85, 99986]

analyze(1000, 3000, 7) -----> [141, 220756]

