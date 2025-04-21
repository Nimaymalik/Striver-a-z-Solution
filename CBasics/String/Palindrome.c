int len = strlen(str), isPalindrome = 1;
for(int i = 0; i < len / 2; i++) {
    if(str[i] != str[len - i - 1]) {
        isPalindrome = 0;
        break;
    }
}
