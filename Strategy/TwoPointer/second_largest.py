
def findSecondLargest(sequenceOfNumbers):
    minn  = sequenceOfNumbers[0]
    sminn = -1 
    for i in range(len(sequenceOfNumbers)):
        print(sequenceOfNumbers[i])
        if(sequenceOcfNumbers[i] > minn):
            sminn = minn 
            minn = sequenceOfNumbers[i]
        
        if(sequenceOfNumbers[i] > sminn and sequenceOfNumbers[i] < minn):
            sminn = sequenceOfNumbers[i]

    return sminn


print("hello")

result = findSecondLargest([10, 25, -12, -6, 20, 20 ])
print(result)