int isSorted = 1;
for(int i = 1; i < n; i++) {
    if(arr[i] < arr[i - 1]) {
        isSorted = 0;
        break;
    }
}
