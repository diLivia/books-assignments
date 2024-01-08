
# Capitulo 04 - Quicksort

## Algoritmo Euclidiano

> Técnica para encontrar de forma rápida o MDC de dois inteiros. 
>
>> O Máximo Divisor Comum (MDC) de dois inteiros A e B é **o maior inteiro que divide A e B.**

O Algoritmo Euclidiano para encontrar o MDC(A,B) é dado por:
- MDC(A,0) = A
- MDC(0,B) = B
- Se A = B⋅Q + R e B ≠ 0, então MDC(A,B) = MDC(B,R) sendo Q um inteiro, e R um inteiro entre 0 e B-1

### Exemplo

1. MDC de 270 e 192: 
    - A=270, B=192
    - 270/192 = 1, R = 78 --> 270 = 192 * 1 + 78

2. MDC(192,78), já que MDC(270,192) = MDC(192,78)
    - A=192, B=78
    - 192/78 = 2, R = 36 --> 192 = 78 * 2 + 36

3. MDC(78,36), já que MDC(192,78) = MDC(78,36)
    - A=78, B=36
    - 78/36 = 2, R = 6 --> 78 = 36 * 2 + 6

4. MDC(36,6), já que MDC(78,36) = MDC(36,6)
    - A=36, B=6
    - 36/6 = 6, R = 0 --> 36 = 6 * 6 + 0

5. MDC(6,0), já que MDC(36,6)=MDC(6,0)
    - A=6, B=0
    - MDC(6,0) = 6

---

**MDC(270,192) = MDC(192,78) = MDC(78,36) = MDC(36,6) = MDC(6,0) = 6
MDC(270,192) = 6**


