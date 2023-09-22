'''
HOW TO USE:
1. call the compare_func(function_1, function_2, array_of_test_arguments) 
insert functions WITHOUT parethesis
2. code will return the number of cases where it did and did not work
3. look at code and cry
'''
import random

def compare_func(f, g, x):
    results = [0, 0]
    set1 = []
    set2 = []
    argset = []
    for i, value in enumerate(x):
        func_1 = f(value)
        func_2 = g(value)
        if func_1 == func_2:
            results[0] += 1
        else:
            results[1] += 1
            set1.append(func_1)
            set2.append(func_2)
            argset.append(value)
        if i % 100000 == 0:
            print(f"iteration {i}")
    msg = f"Of {len(x)} cases tested, {results[0]} had the same output, {results[1]} did not"
    print(msg)
    if results[1] != 0:
        print(f"Of {results[1]} failed cases, here are the corresponding outputs")
        for i, j, k, in zip(set1, set2, argset):
            print(f"{i} differs from {j} and it had the argument {k}")
    return
