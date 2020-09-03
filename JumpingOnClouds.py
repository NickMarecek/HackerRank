#!/bin/python

import math
import os
import random
import re
import sys

# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    current = 0
    jumps = 0

    while current < len(c):
        if current+2<len(c) and c[current+2]==0:
            current += 2
            jumps +=1
        elif current+1<len(c) and c[current+1]==0:
            current += 1
            jumps += 1
        else:
            current+=1
    return jumps
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    c = map(int, input().rstrip().split())

    result = jumpingOnClouds(c)

    fptr.write(str(result) + '\n')

    fptr.close()