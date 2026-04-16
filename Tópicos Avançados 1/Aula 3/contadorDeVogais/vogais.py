def contarVogais(palavra):
    contador = 0
    vogais = ["A", "E", "I", "O","U"]
    maisculas = palavra.upper()
    for i in maisculas:
        if i in vogais:
           contador += 1 

    return contador
