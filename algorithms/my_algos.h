namespace my_algos {
template <typename T> void insertion_sort(T &arr, int n) {
  int i, j;

  for (i = 1; i < n; i++) {
    j = i;
    while ((j > 0) && (arr[j] < arr[j - 1])) {
      auto buffer = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = buffer;
      j = j - 1;
    };
  };
}

} // namespace my_algos
