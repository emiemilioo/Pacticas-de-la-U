def reverse_words(text):
    reverse_list=text.split(" ")
    for i in range(0, len(reverse_list)):
        reverse_list[i]= reverse_list[i][::-1]
    return " ".join(reverse_list)
    pass #go for it
    
    

print(reverse_words('The quick brown fox jumps over the lazy dog.'))
print(reverse_words('apple'))
print((reverse_words('a b c d')))
print((reverse_words('  double  spaced  words  ') ))
print("hola"[::-1])