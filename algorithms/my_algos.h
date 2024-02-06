namespace my_algos {
template <typename T> void insertion_sort(T &arr, int n) {
  int i, j;

  for (i = 1; i < n; i++) {
    j = i;
    while ((j > 0) && (arr[j] < arr[j - 1])) {
      T buffer = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = buffer;
      j = j - 1;
    };
  };
};

template <typename T> void selection_sort(T &s, int n) {
  int i, j;
  int min;

  for (i = 0; i < n; i++) {
    min = i;
    for (j = i + 1; j < n; j++) {
      if (s[j] < s[min]) {
        min = j;
      };
    };
    T buffer = s[i];
    s[i] = s[min];
    s[min] = buffer;
  };
};
template <class T> T heap() {}

} // namespace my_algos
