int vowels = 0, consonants = 0;
for(int i = 0; str[i] != '\0'; i++) {
    char ch = tolower(str[i]);
    if(ch >= 'a' && ch <= 'z') {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            vowels++;
        else
            consonants++;
    }
}
