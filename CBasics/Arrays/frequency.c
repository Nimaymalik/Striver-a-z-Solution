for(int i = 0; i < n; i++) {
    int count = 1;
    if(arr[i] != -1) {
        for(int j = i + 1; j < n; j++) {
            if(arr[i] == arr[j]) {
                count++;
                arr[j] = -1; // mark visited
            }
        }
        printf("%d occurs %d times\n", arr[i], count);
    }
}
