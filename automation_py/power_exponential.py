def POWER_EXPONENTIAL(a, n):

    if n == 0:
        return 1
    else:
        exp = EXPONENTIAL_LOGN(n, n)
        return EXPONENTIAL_LOGN(a, exp)

def EXPONENTIAL_LOGN(a, n):

    if n == 0:
        return 1
    elif n % 2 == 0:
        temp = EXPONENTIAL_LOGN(a, n/2)
        return temp * temp
    else:
        temp = EXPONENTIAL_LOGN(a, (n-1)/2)
        return a * temp * temp

print(POWER_EXPONENTIAL(2, 2))
