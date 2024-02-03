from mergesort import mergeSort
def match_num(A, B, k):

    if len(A) + len(B) == 0:
        return False
    elif len(A) == 0:
        for i in B:
            if i == k:
                return True
        return False
    elif len(B) == 0:
        for i in A:
            if i == k:
                return True
        return False

    mergeSort(A)
    temp_A = A[:]
    temp_B = B[:]
    i = len(temp_A) // 2
    j = 0
    result = temp_A[i] + temp_B[j]
    while j < len(B):

        while len(temp_A) != 0:
            result = temp_A[i] + temp_B[j]
            if result == k:
                return True
            elif result > k:
                temp_A = temp_A[:i]
                i = len(temp_A) // 2
            else:
                temp_A = temp_A[i+1:]
                i = (len(temp_A)) // 2

        j = j + 1
        temp_A = A[:]
    return False

# normal cases
A = [90,80,61,72,10]
B = [1,9,8,7,6,51,2,3]
def checker(A,B):
    possible_thing = []
    for i in A:
        for j in B:
            sum = i+j
            if sum not in possible_thing:
                possible_thing.append(sum)
    if len(A) == 0:
        possible_thing = B[:]
    if len(B) == 0:
        possible_thing = A[:]

    for i in possible_thing:
        print(match_num(A,B, i))

    print(possible_thing)
    return

checker(A,B)

# edge cases
A2 = []
checker(A2, B)

B2 = []
checker(A, B2)

checker([],[])

