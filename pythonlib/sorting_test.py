'''
HOW TO USE:
1. call the sort_test(sort_function, any_array, no_of_test_cases), insert sort_function 
WITHOUT parethesis
2. the function will shuffle and compare with the python sorted() function and 
return the number of cases where it did and did not work
3. look at code and cry

'''
import random

def sort_test(f, array, n):
    results = [0, 0]
    failed_set = []
    correct_set = []
    for i in range(n):
        random.shuffle(array)
        my_sort = f(array)
        py_sort = sorted(array)
        if my_sort == py_sort:
            results[0] += 1
        else:
            results[1] += 1
            failed_set.append(my_sort)
            correct_set.append(py_sort)
        if i % 100000 == 0:
            print(f"iteration {i}")
    msg = f"Of {n} cases tested, {results[0]} was accurate to the sorted() function, {results[1]} was not accurate"
    print(msg)
    if results[1] != 0:
        print(f"Of {results[1]} failed cases, here are the corresponding outputs")
        for fail, correct in zip(failed_set, correct_set):
            print(f"{fail} should be {correct}")
    return

