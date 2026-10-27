Ejercicio 7: Revisión de código con Inteligencia Artificial

1. Objetivo

Analizar un código Java utilizando inteligencia artificial para identificar posibles errores, proponer mejoras y comprobar las sugerencias mediante pruebas.

2. Prompt utilizado

Revisa el código Java de una clase llamada CuentaDigital. Identifica posibles errores lógicos, valida los depósitos y retiros, propone casos de prueba y recomienda mejoras defensivas. Distingue entre los problemas observados y las recomendaciones que deben verificarse.

3. Pruebas propuestas

Depósito positivo: depositar 50. El saldo debe aumentar en 50.

Depósito de cero: depositar 0. La operación debe rechazarse.

Depósito negativo: depositar -5. La operación debe rechazarse.

Retiro válido: retirar una cantidad menor que el saldo. El saldo debe disminuir correctamente.

Retiro excesivo: retirar más dinero del disponible. La operación debe rechazarse.

4. Análisis de las sugerencias

Sugerencia

Clasificación

Justificación

Rechazar depósitos de cero o negativos

Mejora defensiva

Evita operaciones inválidas.

Impedir retiros superiores al saldo

Mejora defensiva

Evita saldos negativos.

Permitir que el saldo sea negativo

No recomendable

Incumple las reglas habituales de una cuenta digital.

Añadir una base de datos

No necesaria para este ejercicio

No es indispensable para comprobar la lógica básica.

Probar los casos límite

Recomendación útil

Permite detectar errores que no aparecen con datos normales.

5. Verificación

Las pruebas deben ejecutarse sobre la implementación real de CuentaDigital. Se deben registrar los resultados obtenidos y compararlos con los resultados esperados. No se deben presentar resultados supuestos como si fueran pruebas ejecutadas.

6. Conclusión

La inteligencia artificial puede ayudar a detectar errores y proponer mejoras, pero sus sugerencias deben verificarse con el código fuente, el enunciado de la práctica y pruebas reales. Una revisión adecuada permite mejorar la validación de datos, evitar saldos inválidos y aumentar la confiabilidad del programa.