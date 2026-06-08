def removerLetras(palavra):
    resultado = ""

    for i in palavra:
        if i in '0123456789':
           resultado += i
    return resultado

print (removerLetras('a2b8c900'))