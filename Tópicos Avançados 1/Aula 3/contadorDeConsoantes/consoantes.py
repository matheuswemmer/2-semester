def contarConsoantes(palavra):
    contador = 0
    vogais = ["A", "E", "I", "O","U"]
    maiusculas = palavra.upper()
    for i in maiusculas:
        if i not in vogais:
           contador += 1 
    return contador
