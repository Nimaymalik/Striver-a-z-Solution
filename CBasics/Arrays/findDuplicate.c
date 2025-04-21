for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {
        if(arr[i] == arr[j]) {
            printf("Duplicate: %d\n", arr[i]);
        }
    }
}
